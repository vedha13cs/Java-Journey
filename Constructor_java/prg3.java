public class ConstructorOverloading {

    ConstructorOverloading() {
        System.out.println("Default Constructor");
    }

    ConstructorOverloading(String name) {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        ConstructorOverloading a =
                new ConstructorOverloading();

        ConstructorOverloading b =
                new ConstructorOverloading("Surabhi");

    }
}
