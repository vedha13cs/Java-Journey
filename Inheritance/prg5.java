class Animal {

    void sound() {

        System.out.println("Animals make sound");

    }

}

class Dog extends Animal {

    @Override
    void sound() {

        System.out.println("Dog barks");

    }

}

public class MethodOverriding {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();

    }
}
