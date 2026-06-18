public class Car {

    String brand;
    int price;

    Car(String b, int p) {

        brand = b;
        price = p;

    }

    void display() {

        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);

    }

    public static void main(String[] args) {

        Car c =
          new Car("Toyota", 1200000);

        c.display();

    }
}
