package Recursion;
import java.util.*;

// give a number covert it into a string of english

public class Convert{
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

        System.out.print("Enter the number : ");
        String input = sc.nextLine();
               
        int num[] = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            num[i] = input.charAt(i) - '0';
        }

        cov(num, digits, 0);
        sc.close();
    }

    public static void cov(int num[], String digits[], int i){
        if( i == num.length) return;

        System.out.print(digits[num[i]] + " ");
        cov(num, digits, i + 1);
    }
}