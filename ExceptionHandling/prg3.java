public class FinallyDemo {

    public static void main(String[] args) {

        try {

            int result = 20 / 2;

            System.out.println(result);

        } finally {

            System.out.println("Finally block executed.");

        }

    }
}
