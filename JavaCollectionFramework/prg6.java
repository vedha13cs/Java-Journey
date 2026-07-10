import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        Iterator<String> iterator = colors.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
