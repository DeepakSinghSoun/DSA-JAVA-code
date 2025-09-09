package Recursion;
import java.util.*;

// find how many tiling fit in space

public class Tiling{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        System.out.print("Total Way are : " + til(num));
        sc.close();
    }

    public static int til(int num){
        if( num == 0 || num == 1) return 1;
        
        return til(num - 1) + til(num - 2);
    }
}