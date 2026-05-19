public class NestedIf {
    public static void main(String[] args) {

        int age = 22;
        boolean hasID = true;

        if(age >= 18) {
            if(hasID) {
                System.out.println("Entry Allowed");
            }
        }

    }
}
