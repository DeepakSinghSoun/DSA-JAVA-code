package Recursion;
import java.util.*;

// print all binary strings of size n without consecutive (0 or 1).

public class BinaryString{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many binary numbers to print: ");
        int count = sc.nextInt();

        System.out.print("Enter starting number (0 or 1): ");
        int start = sc.nextInt();

        binStr(count, start, "");
        sc.close();
    }

    public static void binStr(int count, int start, String str){
        if(count == 0){ 
            System.out.println(str);
            return;
        }

        binStr(count - 1, 0, str + 0);
        if(start == 0){
            binStr(count - 1, 1, str + 1);
            
        }
    }
}