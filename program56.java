public class EvenOddMethod {

    static void checkNumber(int number) {

        if(number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {

        checkNumber(7);

    }
}
