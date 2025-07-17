package functionsAndMethods;
import java.util.*;

// find number is even or odd 

public class evenOrOdd {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = sc.nextInt();

        if(isEven(num)){
            System.out.print("Number is Even");
        }else {
            System.out.print("Number is Odd");
        }
        sc.close();
    }

    public static boolean isEven(int num){
        if (num %2 == 0){
            return true;
        }else {
            return false;
        }
    }
}
