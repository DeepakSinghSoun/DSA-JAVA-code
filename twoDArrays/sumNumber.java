package twoDArrays;
import java.util.*;

// print the sum of the numbr in the second row 2d array.

public class sumNumber {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Row Number : ");
        int num = sc.nextInt();
        int arr[][] = { {1,4,9},{11,4,3},{2,2,3} };

        findNum(arr,num);
        sc.close();
    }

    public static void findNum(int arr[][], int num) {
        int rowIndex = num - 1;
        int totalSum = 0;
        
        if (rowIndex < 0 || rowIndex >= arr.length) {
            System.out.println("Invalid row number.");
            return;
        }

        for (int i = 0; i < arr[rowIndex].length; i++) {
            totalSum += arr[rowIndex][i];
        }

        System.out.println("Sum of Row " + num + " is: " + totalSum);
    }
}