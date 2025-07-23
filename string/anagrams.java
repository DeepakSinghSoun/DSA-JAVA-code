package string;
import java.util.*;

// find two string are anagrams or not 

public class anagrams{
    public static void main(String []args){
        String str1 = "listen";
        String str2 = "silent";

        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println("Yes, they are anagrams.");
        } else {
            System.out.println("No, they are not anagrams.");
        }
    }
}