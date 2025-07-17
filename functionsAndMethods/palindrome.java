package functionsAndMethods;
import java.util.*;

// check if a number is a palindrome or not 

public class palindrome {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();

        if(isPal(num)){
            System.out.print("This number is Palindrome");
        }else {
            System.out.print("This number is NOt a Palindrome");
        }
        sc.close();
    }

    public static boolean isPal(int num){
        int original = num;
        int rev = 0;

        while (original != 0) {
            int lastDigit = original % 10;
            rev = (rev * 10) + lastDigit;
            original /= 10;
        }

        return rev == num;    
    }
}
