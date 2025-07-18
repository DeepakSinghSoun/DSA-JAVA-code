package arrays;
import java.util.*;

// Given the rotated array nums and a target, return index if found, else -1.

public class integerTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target Number: ");
        int num = sc.nextInt();

        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 9, 0};
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Target value found at index: " + index);
        } else {
            System.out.println("Target value not found in array: -1");
        }

        sc.close();
    }
}
