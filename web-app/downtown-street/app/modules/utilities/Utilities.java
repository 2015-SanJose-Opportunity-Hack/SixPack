package modules.utilities;

import java.io.File;
import java.math.BigInteger;
import java.net.URI;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import play.mvc.Http.MultipartFormData.FilePart;

public class Utilities {
	
	private final static String directoryPath = play.Play.application().configuration().getString("request.imageDirectory");
	
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
    	String directoryPath = play.Play.application().configuration().getString("inventory.imagePath");
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
	
}
