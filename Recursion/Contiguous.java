package Recursion;
import java.util.*;

// find the count of all contiguous substrings starting and ending with the same character.

public class Contiguous{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();

        System.out.print("This is Total Count : " + count(str));
    }
}