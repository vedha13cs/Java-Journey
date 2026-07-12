import java.util.Arrays;
import java.util.List;

public class WildcardDemo {

    static void printList(List<?> list) {

        for (Object obj : list) {
            System.out.println(obj);
        }

    }

    public static void main(String[] args) {

        List<String> names =
                Arrays.asList("Surabhi", "Rahul", "Ananya");

        printList(names);

    }
}
