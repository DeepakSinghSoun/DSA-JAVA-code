// find the largest and smallest element in a array.

import java.util.*;

public class MinMax {

    public static int[] findMinMax(int[] arr) {
        int smallest = arr[0];
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return new int[] { smallest, largest };
    }

    public static void main(String[] args) {
        int[] arr = { 10, 30, 4, 40, 24, 3 };

        int[] result = findMinMax(arr);

        System.out.println("Smallest element: " + result[0]);
        System.out.println("Largest element: " + result[1]);
    }
}
