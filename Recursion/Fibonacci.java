package Recursion;
import java.util.*;

// Print Nth fibonacci number

public class Fibonacci{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();

         System.out.println("Fibonacci at position " + num + " is: " + fib(num));
        sc.close();
    }

    public static int fib(int num){
        if (num == 0 || num == 1) return num;

        return fib(num - 1) + fib(num - 2);
    }
}