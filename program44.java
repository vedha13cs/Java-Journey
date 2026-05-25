public class SearchElement {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;

        boolean found = false;

        for(int num : arr) {
            if(num == target) {
                found = true;
                break;
            }
        }

        if(found) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }
    }
}
