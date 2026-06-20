public class Student {

    String name;
    int age;

    Student(String name, int age) {

        this.name = name;
        this.age = age;

    }

    void display() {

        System.out.println(name);
        System.out.println(age);

    }

    public static void main(String[] args) {

        Student s =
            new Student("Surabhi", 21);

        s.display();

    }
}
