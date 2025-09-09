package question;
import java.util.*;

// Leet code question. `Level` : Easy

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Target number : ");
        int target = sc.nextInt();

        int arr[] = {2, 7, 11, 15};

        int n = -1, m = -1;
        outer:
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    n = i;
                    m = j;
                    break outer;
                }
            }
        }

        if (n != -1) {
            System.out.println("Indices: [" + n + ", " + m + "]");
            System.out.println("Values : [" + arr[n] + ", " + arr[m] + "]");
        } else {
            System.out.println("No pair found.");
        }

        sc.close();
    }
}