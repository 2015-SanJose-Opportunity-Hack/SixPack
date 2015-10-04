package modules.utilities;

import java.io.File;
import java.math.BigInteger;
import java.net.URI;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import play.mvc.Http.MultipartFormData.FilePart;

import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.MessageFactory;

public class Utilities {
	
	private final static String directoryPath = play.Play.application().configuration().getString("request.imageDirectory");
	private static final String username = play.Play.application().configuration().getString("mail.username");
	private static final String password = play.Play.application().configuration().getString("mail.password");
	private static final String ACCOUNT_SID = play.Play.application().configuration().getString("twilio.account_sid");
	private static final String AUTH_TOKEN = play.Play.application().configuration().getString("twilio.auth_token");

	
	/**
	 * Function to get MD5 hash of a string
	 * @param s String to hash
	 * @return MD5 hash as a string
	 */
	public static String getMD5Hash(String s){
		MessageDigest m = null;
		try {
			m = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m.update(s.getBytes(),0,s.length());
		return new BigInteger(1,m.digest()).toString(16);
	}
	
	public static boolean isNumber(String number){
		return Pattern.matches("[0-9]+", number);
	}
	
	public static String getRandomUID(){
		return UUID.randomUUID().toString();
	}
	
	public static boolean isValidDate(Date maybeDate, String format){
		boolean isValid = false;
		org.joda.time.DateTime date = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			String stringDate = sdf.format(maybeDate );
			System.out.println(stringDate);
			DateTimeFormatter fmt = DateTimeFormat.forPattern(format);
		    date =  fmt.parseDateTime(stringDate);
		    isValid = true;
		  } catch (Exception e) {
			  
		  }
		  return isValid;
	}
	
	public static boolean isValidUsername(String username){
		  Pattern pattern = Pattern.compile("^[a-z0-9_-]{3,15}$");
		  Matcher matcher = pattern.matcher(username);
		  if( username.length() > 6 && matcher.matches() ){
			  return true;
		  }
		  return false;
	}
	
	/**
     * Function to upload an image and store it in the database
     * @param file FilePart type file
     * @return Name of the file
     */
    public static String uploadItemPicture(FilePart file){
    	String directoryPath = play.Play.application().configuration().getString("request.imageDirectory");
    	String fileName = "";
    	FilePart pictureFile = file;
    	try {
			String tempName = pictureFile.getFilename();
	    	String fileDetails[] = tempName.split("\\.");
	    	String fileExtension = fileDetails[fileDetails.length - 1];
	    	fileName = Utilities.getRandomUID()+"." + fileExtension;
			File destination = new File(directoryPath, fileName);
			pictureFile.getFile().renameTo(destination);
		} catch (Exception e) {
			return "";
		}
	    return fileName;
    }
    
    /**
     * Function to delete file
     * @param fileName Name of the file to be deleted
     * @return Is the file deleted or an exception was thrown
     */
    public static boolean deleteFile(String fileName){
    	String filePath = directoryPath+fileName;
    	try{
    		File file = new File(filePath);
    		file.delete();
    	}catch(Exception e){
    		return false;
    	}
    	return true;
    }
    
    /**
     * Get image path by image name
     * @param fileName
     * @return
     */
    public static String getImagePath(String fileName){
    	String directoryPath = play.Play.application().configuration().getString("request.imageDirectory");
    	String filePath = directoryPath+fileName;
    	System.out.println(filePath);
    	File file = null;
    	String fileUrl = "";
    	try{
    		file = new File(filePath);
    		URI uri = file.toURI();
    		fileUrl = uri.resolve(uri).toString();
    	}catch(Exception e){
    		return "";
    	}
    	return fileUrl;
    }
    
    public static void sendEmail(String subject, String to, String message1) {
		
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(username, password);
					}
				});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("harsh0008@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(to));
			message.setSubject(subject);
			message.setText(message1);

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
    
	
	public static void sendMessage(String mobilenumber,String message) throws TwilioRestException
	{
		TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
		 Map maps = new HashMap<String, String>();
	    // Build a filter for the MessageList
	    List<NameValuePair> params = new ArrayList<NameValuePair>();
	    String body=message;
	    if(message!=null && message.length()==0){
	    	body="Default Message Here";
	    }
	    params.add(new BasicNameValuePair("Body",body));
	    params.add(new BasicNameValuePair("To",mobilenumber));
	    params.add(new BasicNameValuePair("From", "+15106835602"));
	    //params.add(new BasicNameValuePair("MediaUrl", "http://www.example.com/hearts.png"));
	    maps.put("Body",message);
	    maps.put("To",mobilenumber);
	    maps.put("From", "+15106835602");
	     
	    /*SmsFactory smsFactory = client.getAccount().getSmsFactory();
	    Sms message1 = smsFactory.create(maps);*/
	    
	    MessageFactory messageFactory = client.getAccount().getMessageFactory();
	    com.twilio.sdk.resource.instance.Message message1 = messageFactory.create(params);

	}
	
	public static void sendEmailwithAttach(String subject, String to, String message1,String filename) {
		
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(username, password);
					}
				});

		try {

			// Create a default MimeMessage object.
	         Message message = new MimeMessage(session);

	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress("downtownstreetsdemo@gmail.com"));

	         // Set To: header field of the header.
	         message.setRecipients(Message.RecipientType.TO,
	            InternetAddress.parse(to));

	         // Set Subject: header field
	         message.setSubject(subject);

	         // Create the message part
	         BodyPart messageBodyPart = new MimeBodyPart();

	         // Now set the actual message
	         messageBodyPart.setText(message1);

	         // Create a multipar message
	         Multipart multipart = new MimeMultipart();

	         // Set text message part
	         multipart.addBodyPart(messageBodyPart);

	         // Part two is attachment
	         messageBodyPart = new MimeBodyPart();
	         //String filename = "C:\\Users\\amoghrao\\Pictures\\Desert.jpg";
	         DataSource source = new FileDataSource(filename);
	         messageBodyPart.setDataHandler(new DataHandler(source));
	         messageBodyPart.setFileName(filename);
	         multipart.addBodyPart(messageBodyPart);
	         
	         //for html
	         MimeBodyPart htmlPart = new MimeBodyPart();
	         htmlPart.setContent("<html> <body> <a href='https://www.paypal.com/cgi-bin/webscr?cmd=_donations&business=P8T325CM86T6J&lc=US&currency_code=USD&bn=PP%2dDonationsBF%3abtn_donateCC_LG%2egif%3aNonHosted'> <img src='https://www.paypal.com/en_US/i/btn/btn_donateCC_LG.gif' width='140' height='60'>  </body> </html> ", "text/html");
	         multipart.addBodyPart(htmlPart);

	         // Send the complete message parts
	         message.setContent(multipart);

	         // Send message
	         Transport.send(message);

	         System.out.println("Sent message successfully....");
			

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}
