package bitManiplation;
import java.util.*;

// add 1 to an integer using bit manipulation

public class addOne{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number : ");
        int num = sc.nextInt();
        
        System.out.print(num + " + " + 1 + " : " + (-(~num)));

        sc.close();
    }
}