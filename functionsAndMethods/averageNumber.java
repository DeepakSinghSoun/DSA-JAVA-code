package functionsAndMethods;
import java.util.*;

// find the average of three numbers

public class averageNumber {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 1 number : ");
        int a = sc.nextInt();
        System.out.print("Enter your 2 number : ");
        int b = sc.nextInt();
        System.out.print("Enter your 3 number : ");
        int c = sc.nextInt();
        avegNum(a,b,c);
        sc.close();
    }

    public static void avegNum(int a,int b, int c) {
        float aveg = (a + b + c ) / 3;
        System.out.print("This is Average of a Number : " + aveg);
    }
}
