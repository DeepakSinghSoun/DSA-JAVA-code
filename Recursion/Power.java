package Recursion;
import java.util.*;

// Print x to the power n

public class Power{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.print("Enter the power : ");
        int power = sc.nextInt();

        System.out.print(NumPow(num, power));
        sc.close();
    }

    public static int NumPow(int num, int power){
        if(power == 0) return 1;

        return num * NumPow(num, power - 1);
    }
}