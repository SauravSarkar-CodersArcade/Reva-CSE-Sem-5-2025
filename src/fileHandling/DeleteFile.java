package fileHandling;
import java.io.File;
import java.io.IOException;
public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("./CSE/reva.txt");
        if(file.delete()){
            System.out.println("File: " + file.getName() +
                    " deleted.");
        }else {
            System.out.println("Failed to delete the file.");
        }
    }
}
