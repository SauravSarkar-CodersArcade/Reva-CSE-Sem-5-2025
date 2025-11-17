package fileHandling;
import java.io.File;
public class DeleteFolder {
    public static void main(String[] args) {
        // Relative Path -> Starts from the current directory
        // . means current folder & / means we entered the current folder
        File folder = new File("./Python");
        if(folder.delete()){
            System.out.println("Folder: " + folder.getName() + " deleted.");
        }else {
            System.out.println("Failed to delete the folder.");
        }
    }
}
