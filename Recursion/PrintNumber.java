package Recursion;
import java.util.*;

// print numbers in decreasing order

public class PrintNumber{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();

        decreasing(num);
        sc.close();
    }

    public static void decreasing(int num){
        if(num == 1){
            System.out.print(num);
            return;
        }
        System.out.print(num + " ");
        decreasing(num - 1);

    }
}