package Recursion;
import java.util.*;

// find all the occurrences of a given elemet (key)

public class Occurrences{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key : ");
        int key = sc.nextInt();

        int arr[] = {3, 2, 4, 5, 6, 2, 7,2, 2};

        occ(arr, key, 0);
        sc.close();
    }

    public static void occ(int arr[], int key, int i){
        if(i == arr.length) return;
        if(arr[i] == key) System.out.print(i + " ");
        occ(arr, key, i + 1); 
    }
}