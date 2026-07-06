import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("StudentData.txt", true);

            writer.write("\nGitHub Upload Day 17");

            writer.close();

            System.out.println("Data Appended Successfully");

        } catch (IOException e) {

            System.out.println(e.getMessage());

        }
    }
}
