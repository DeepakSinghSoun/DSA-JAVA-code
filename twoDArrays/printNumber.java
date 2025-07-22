package twoDArrays;
import java.util.*;

// print the numbr that are in the 2d array.

public class printNumber {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number : ");
        int num = sc.nextInt();
        int arr[][] = {{4,7,8},{8,8,7}};

        findNum(arr,num);
        sc.close();
    }

    public static void findNum(int arr[][],int num){
        int r = arr.length, c = arr[0].length;
        int totalNum = 0;

        for(int i = 0; i < r ; i++){
            for(int j = 0; j < c; j++){
                if(arr[i][j] == num) {
                    totalNum++;
                }
            }
        }

        if (totalNum > 0) {
            System.out.print("This number " + num + " in arrays is: " + totalNum);
        } else {
            System.out.print("No number found in the array");
        }
    }
}