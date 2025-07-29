package Recursion;
import java.util.*;

// find the first occurence of an element in an array

public class FistOccurrence {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int key = sc.nextInt();

        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};

        int index = occ(arr, key, 0);
        if (index != -1) {
            System.out.println("First occurrence at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
        sc.close();
    }

    public static int occ(int arr[], int key, int i){
        if(i > arr.length - 1) return -1;

        if(key == arr[i]) return i;

        return occ(arr, key, i + 1);
    }
}