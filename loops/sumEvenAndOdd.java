import java.util.*;

// find the even or add number and sum of both even or add number

public class sumEvenAndOdd {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);

        int sumEven = 0, sumOdd = 0, choice, number;
        
        do {
            System.out.print("Enter your Number : " );
            number = sc.nextInt();

            if (number%2 == 0){
                System.out.println("even : "+ number);
                sumEven += number;
            }else{
                System.out.println("odd : "+ number);
                sumOdd += number;
            }

            System.out.print("Do you want to continue? Press 1 for yes or 0 for no : ");
            choice = sc.nextInt();

        } while(choice == 1);

        System.out.println("This is a Sum of Even Number : "+ sumEven);
        System.out.println("This is a Sum of Odd Number : "+ sumOdd);
        sc.close();
    }
}
