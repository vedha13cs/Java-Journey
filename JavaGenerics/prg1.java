class Box<T> {

    T value;

    Box(T value) {
        this.value = value;
    }

    void display() {
        System.out.println(value);
    }
}

public class GenericClassDemo {

    public static void main(String[] args) {

        Box<String> b1 = new Box<>("Java");
        Box<Integer> b2 = new Box<>(100);

        b1.display();
        b2.display();
    }
}
