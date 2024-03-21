import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/** Shows how to read data from the file usign a BufferedReader */
public class BufferedReaderExample {
    public static void main(String[] args) {
        String filename = "file.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
