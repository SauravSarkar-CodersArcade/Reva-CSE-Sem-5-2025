package fileHandling;
import java.io.File;
public class CreateFolder {
    public static void main(String[] args) {
        // mkdir() -> Creates the last folder if path is correct
        // mkdirs() -> Creates the complete sub-folder sequence till the last one
        File folder = new File("/Users/sauravsarkar/Documents/Java/REVA-CS-B1/CSE/Java/B2/Demo/Eng");
        if(folder.mkdirs()){
            System.out.println("Folder: " + folder.getName() + " created.");
        }else {
            System.out.println("Failed to create the folder.");
        }
    }
}
