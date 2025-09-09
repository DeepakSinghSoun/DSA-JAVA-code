package Recursion;
import java.util.*;

// find Length of a String

public class StringLength {       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        System.out.println("Length of '" + str + "' is: " + length(str));

        sc.close();
    }

    public static int length(String str) {
        if (str.length() == 0) return 0;
        
        return length(str.substring(1)) + 1;
    }
}
