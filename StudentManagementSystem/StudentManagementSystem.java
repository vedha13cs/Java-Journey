import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudent();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    System.out.println("Thank You!");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    static void addStudent() {

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        students.add(new Student(id, name, age));

        System.out.println("Student Added Successfully!");
    }

    static void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No Students Found.");
            return;
        }

        for (Student s : students) {
            s.display();
        }
    }

    static void searchStudent() {

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        for (Student s : students) {

            if (s.getId() == id) {

                s.display();
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    static void updateStudent() {

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        for (Student s : students) {

            if (s.getId() == id) {

                System.out.print("Enter New Name: ");
                s.setName(sc.nextLine());

                System.out.print("Enter New Age: ");
                s.setAge(sc.nextInt());

                System.out.println("Student Updated Successfully!");
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    static void deleteStudent() {

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        for (Student s : students) {

            if (s.getId() == id) {

                students.remove(s);

                System.out.println("Student Deleted Successfully!");
                return;
            }
        }

        System.out.println("Student Not Found.");
    }
}
