interface Vehicle {

    void accelerate();
}

class Bike implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Bike is accelerating");
    }
}

public class VehicleDemo {

    public static void main(String[] args) {

        Bike bike = new Bike();

        bike.accelerate();
    }
}
