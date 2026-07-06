import java.io.File;

public class DeleteFile {

    public static void main(String[] args) {

        File file = new File("StudentData.txt");

        if (file.delete()) {
            System.out.println("File Deleted Successfully");
        } else {
            System.out.println("Unable to Delete File");
        }
    }
}
