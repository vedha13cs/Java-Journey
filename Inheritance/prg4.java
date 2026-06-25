class Parent {

    String name = "Parent Class";

}

class Child extends Parent {

    String name = "Child Class";

    void display() {

        System.out.println(super.name);
        System.out.println(name);

    }

}

public class SuperKeyword {

    public static void main(String[] args) {

        Child c = new Child();

        c.display();

    }
}
