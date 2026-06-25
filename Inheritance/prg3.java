class Animal {

    void eat() {

        System.out.println("Eating");

    }

}

class Dog extends Animal {

    void bark() {

        System.out.println("Bark");

    }

}

class Cat extends Animal {

    void meow() {

        System.out.println("Meow");

    }

}

public class HierarchicalInheritance {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();

    }
}
