package functionsAndMethods;
import java.util.*;

// sum of the digits in an integer

public class sumOfDigits {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your number : ");
        int num = sc.nextInt();

        System.out.print("This is Digits Sum Of number : " + sumDigits(num));
        sc.close();
    }

    public static int sumDigits(int num){
        int totalSum = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            totalSum += lastDigit;
            num /= 10;
        }

        return totalSum;
    }
}
