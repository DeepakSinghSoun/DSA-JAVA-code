import java.util.*;

// Average of 3 Number

public class averageofThreeNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = a+b+c/3;
        System.out.print("Average of Number is :" + average);
    }
}