public class FactorialMethod {

    static int factorial(int number) {

        int fact = 1;

        for(int i = 1; i <= number; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {

        System.out.println("Factorial = " + factorial(5));

    }
}
