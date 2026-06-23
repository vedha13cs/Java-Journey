public class Person {

    private String city;

    public void setCity(String city) {

        this.city = city;

    }

    public String getCity() {

        return city;

    }

    public static void main(String[] args) {

        Person p = new Person();

        p.setCity("Bangalore");

        System.out.println(p.getCity());

    }
}
