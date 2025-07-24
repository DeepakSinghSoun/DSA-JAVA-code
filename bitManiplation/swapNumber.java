package bitManiplation;
import java.util.*;

// Swap two numbers without using any third variable

public class swapNumber{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 1 number : ");
        int a = sc.nextInt();
        System.out.print("Enter your 2 number : ");
        int b = sc.nextInt();

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        sc.close();
    }
}