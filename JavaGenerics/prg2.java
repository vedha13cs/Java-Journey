public class GenericMethodDemo {

    static <T> void printData(T data) {
        System.out.println(data);
    }

    public static void main(String[] args) {

        printData("Hello");
        printData(25);
        printData(5.5);

    }
}
