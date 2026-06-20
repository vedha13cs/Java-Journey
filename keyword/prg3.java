public class StaticVariable {

    static String college = "ABC College";

    String name;

    StaticVariable(String name) {
        this.name = name;
    }

    void display() {

        System.out.println(name);
        System.out.println(college);

    }

    public static void main(String[] args) {

        StaticVariable s1 =
            new StaticVariable("Surabhi");

        StaticVariable s2 =
            new StaticVariable("Riya");

        s1.display();
        s2.display();

    }
}
