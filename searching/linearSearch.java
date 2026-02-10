package searching;

public class linearSearch {

    public static void Search(int arr[], int key) {
        boolean count = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == key) {
                System.out.print("Found in Index : " + i);
                count = true;
                break;
            }
        }
        if (count == false) {
            System.out.print("Not found");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 100;

        Search(arr, key);
    }
}
