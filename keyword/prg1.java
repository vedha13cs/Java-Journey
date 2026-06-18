public class ThisKeyword {

    String name;

    ThisKeyword(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name);
    }

    public static void main(String[] args) {

        ThisKeyword obj =
            new ThisKeyword("Surabhi");

        obj.display();
    }
}
