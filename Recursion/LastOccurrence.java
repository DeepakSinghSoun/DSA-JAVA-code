package Recursion;
import java.util.*;

// find the Last occurence of an element in an array

public class LastOccurrence {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int key = sc.nextInt();

        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};

        int index = lastocc(arr, key, arr.length - 1);

        if (index != -1) {
            System.out.println("First occurrence at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
        sc.close();
    }

    public static int lastocc(int arr[], int key, int i){
        if(i < 0) return -1;

        if(key == arr[i]) return i;

        return lastocc(arr, key, i - 1);
    }
}