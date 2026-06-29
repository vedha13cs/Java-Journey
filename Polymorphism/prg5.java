public class Calculator {

    double multiply(double a, double b) {
        return a * b;
    }

    double multiply(double a, double b, double c) {
        return a * b * c;
    }

    public static void main(String[] args) {

        Calculator cal = new Calculator();

        System.out.println(cal.multiply(2, 5));
        System.out.println(cal.multiply(2, 5, 3));

    }
}
