import java.util.*;

// find the year is Leap year or not

public class leapOrNotLeapYear {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Year : ");
        int year = sc.nextInt();

        // if(year%4 == 0){
        //     if(year%100 == 0){
        //         if(year%400 == 0){
        //             System.out.print("This is a Leap Year : " + year);
        //         }else {
        //             System.out.print("This is Not a Leap Year : " + year);
        //         }
        //     }else {
        //         System.out.print("This is a Leap Year : " + year);
        //     }
        // }else {
        //     System.out.print("This is NOt a Leap Year : " + year);
        // }

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) == 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z)){
            System.out.print(year + " is a leap year");
        }else {
            System.out.print(year + " is not a leap Year");
        }
        sc.close();
    }
}
