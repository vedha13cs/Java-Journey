import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("StudentData.txt");

            writer.write("Name: Surabhi\n");
            writer.write("Course: Computer Science\n");
            writer.write("Learning Java File Handling");

            writer.close();

            System.out.println("Data Written Successfully");

        } catch (IOException e) {

            System.out.println(e.getMessage());

        }
    }
}
