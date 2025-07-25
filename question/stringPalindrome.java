package question;
import java.util.*;

// check whether a string is a palindrome or not

public class stringPalindrome{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your sting : ");
        String str = sc.nextLine();

        boolean isPalindrome = true;

        for ( int i = 0; i < str.length() / 2; i++){
            int n = str.length();

            if(str.charAt(i) != str.charAt(n-1-i)){
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome){
            System.out.print("This is palindrome");
        }else {
            System.out.print("This is not a paindrome");
        }

        sc.close();
    }
}