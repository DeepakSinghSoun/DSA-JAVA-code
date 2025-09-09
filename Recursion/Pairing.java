package Recursion;
import java.util.*;

// Find how many pairing 

public class Pairing{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        System.out.print("This is total pairing : " + pair(num));
        sc.close();
    }

    public static int pair(int num){
        if(num == 1 || num == 2) return num;

        return pair(num - 1) + (num - 1) * pair(num - 2);
    }
}