package fileHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadDataFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        File obj = new File("./CSE/reva.txt");
        Scanner reader = new Scanner(obj);
        while (reader.hasNext()){
            String data = reader.nextLine();
            System.out.println(data);
        }
        reader.close();
    }
}
