public class ParameterizedConstructor {

    String name;

    ParameterizedConstructor(String n) {
        name = n;
    }

    public static void main(String[] args) {

        ParameterizedConstructor s =
                new ParameterizedConstructor("Surabhi");

        System.out.println(s.name);

    }
}
