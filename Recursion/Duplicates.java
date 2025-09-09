package Recursion;
import java.util.*;

// Remove Duplicates in a String

public class Duplicates{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();

        dupl(str, 0, new StringBuilder(""), new boolean[26]);
        sc.close();
    }

    public static void dupl(String str,int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()){
            System.out.print(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            dupl(str, idx + 1, newStr, map);
        }else{
            map[currChar - 'a'] = true;
            dupl(str, idx + 1, newStr.append(currChar), map);
        }
    }
}