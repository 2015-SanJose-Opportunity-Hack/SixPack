package modules.utilities;

import java.io.File;
import java.net.URI;

import models.Admin;
import play.mvc.Http.MultipartFormData.FilePart;

public class Setup {
	
private final static String directoryPath = play.Play.application().configuration().getString("inventory.imagePath");
	
	
    
    /*****************************
     * HELPER FUNCTIONS BELOW
     ****************************/
    
    //INITIAL SETUP WHEN THE INVENTORY IS NEW
    public static void initSetup(){
    	initAdmin();
    }
    
    //init default admin
    private static void initAdmin(){
    	Admin admin = new Admin();
    	admin.setId(1);
    	admin.setUsername("downtown_street");
    	admin.setPassword(Utilities.getMD5Hash("password"));
    	admin.setContact("1800800800");
    	admin.setEmail("test@admin.com");
    	admin.save();
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
    	String directoryPath = play.Play.application().configuration().getString("inventory.imagePath");
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
