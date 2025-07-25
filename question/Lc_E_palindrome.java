package question;
import java.util.*;

// Leet code question. `Level` : Easy

//find palindrome or not

public class Lc_E_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        sc.close();

        if (isPalindrome(num)) {
            System.out.println("it is a palindrome.");
        } else {
            System.out.println("it is not a palindrome.");
        }
    }

    static boolean isPalindrome(int num) {
        if (num < 0) return false;

        int original = num;
        int rev = 0;

        while (num > 0) {
            int last = num % 10;
            rev = rev * 10 + last;
            num /= 10;
        }
        return rev == original;
    }
}
