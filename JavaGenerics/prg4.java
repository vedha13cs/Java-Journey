class Calculator<T extends Number> {

    T number;

    Calculator(T number) {
        this.number = number;
    }

    void display() {
        System.out.println(number);
    }
}

public class BoundedTypeDemo {

    public static void main(String[] args) {

        Calculator<Integer> c =
                new Calculator<>(100);

        c.display();

    }
}
