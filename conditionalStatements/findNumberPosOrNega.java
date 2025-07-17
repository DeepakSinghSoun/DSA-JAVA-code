import java.util.*;

// Print whether it is postive or negative number

public class findNumberPosOrNega {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();

        if(num >= 0){
            System.out.print("This number is Postive : " + num);
        }else {
            System.out.print("This number is Negative : "+ num);
        }
        sc.close();
    }
}