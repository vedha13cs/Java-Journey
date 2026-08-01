public class LargestElement {

    public static void main(String[] args) {

        int[] arr = {12, 45, 7, 89, 23};

        int largest = arr[0];

        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("Largest Element: " + largest);
    }
}
