import java.util.*;

// Average of 3 Number

public class averageOfThreeNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 1 number : ");
        int a = sc.nextInt();
        System.out.print("Enter your 2 number : ");
        int b = sc.nextInt();
        System.out.print("Enter your 3 number : ");
        int c = sc.nextInt();
        
        int average = a+b+c/3;
        System.out.print("Average of Number is :" + average);
        sc.close();
    }
}