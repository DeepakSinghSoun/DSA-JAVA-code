package Recursion;
import java.util.*;

// find Factorial of N

public class Factorial{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();

        System.out.print("This is factorial number : " + fact(num));
        sc.close();
    }

    public static int fact(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        return num * fact(num - 1);
    }
}