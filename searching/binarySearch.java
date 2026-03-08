package searching;

public class binarySearch {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12 };
        int key = 10;

        System.out.print("index : " + search(arr, key));
    }

    public static int search(int arr[], int key) {
        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        while (firstIndex <= lastIndex) {
            int mid = (firstIndex + lastIndex) / 2;
            if (key == arr[mid]) {
                return mid;
            }
            if (key > arr[mid]) {
                firstIndex = mid + 1;
            } else {
                lastIndex = mid - 1;
            }
        }
        return -1;
    }
}
