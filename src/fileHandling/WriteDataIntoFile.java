package fileHandling;
import java.io.FileWriter;
import java.io.IOException;
public class WriteDataIntoFile {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new
                FileWriter("./CSE/reva.txt", true);
        writer.append("\nThis is 5th Semester, AIML, 2025");
        writer.close();
        System.out.println("Successfully wrote data into the file.");
    }
}
