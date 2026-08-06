public class BinarySearchRecursion {

    static int binarySearch(int[] arr, int left, int right, int key) {

        if (left > right)
            return -1;

        int mid = (left + right) / 2;

        if (arr[mid] == key)
            return mid;

        if (key < arr[mid])
            return binarySearch(arr, left, mid - 1, key);

        return binarySearch(arr, mid + 1, right, key);
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int index = binarySearch(arr, 0, arr.length - 1, 30);

        System.out.println("Index = " + index);
    }
}
