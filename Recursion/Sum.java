package Recursion;
import java.util.*;

// print Sum of N number

public class Sum{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();

        System.out.print("This is factorial number : " + add(num));
        sc.close();
    }

    public static int add(int num){
        if(num == 0) return 0;
        if(num == 1){
            return 1;
        }
        return num + add(num - 1);
    }
}