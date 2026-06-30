abstract class Bird {

    abstract void fly();
}

class Eagle extends Bird {

    @Override
    void fly() {
        System.out.println("Eagle flies high");
    }
}

public class AnimalExample {

    public static void main(String[] args) {

        Eagle e = new Eagle();

        e.fly();
    }
}
