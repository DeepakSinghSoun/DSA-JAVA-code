package Recursion;
import java.util.*;

// Print x to the power n (Optimized)

public class OptimizedPower{
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

        int halfPower = NumPow(num, power/2);        
        int halfPowerSq = halfPower * halfPower;

        if(power % 2 != 0) return num * halfPowerSq;

        return halfPowerSq;
    }
}