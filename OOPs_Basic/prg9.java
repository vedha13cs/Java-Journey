public class Rectangle {

    int length = 10;
    int width = 5;

    int area() {
        return length * width;
    }

    public static void main(String[] args) {

        Rectangle r = new Rectangle();

        System.out.println("Area = " + r.area());
    }
}
