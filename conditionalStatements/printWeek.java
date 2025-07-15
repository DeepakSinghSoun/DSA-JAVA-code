import java.util.*;

// input week number (1-7) and print day of week name using switch case


public class printWeek {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Week Number : ");
        int weekNum = sc.nextInt();

        switch(weekNum) {
            case 1: System.out.print("Monday");
                    break;
            case 2: System.out.print("Tuseday");
                    break;
            case 3: System.out.print("Wednesday");
                    break;
            case 4: System.out.print("Thursday");
                    break;
            case 5: System.out.print("Friday");
                    break;
            case 6: System.out.print("Saturday");
                    break;
            case 7: System.out.print("Sunday");
                    break;
            default:
                    System.out.print("Incalid input! Please enter week number between 1 - 7");
        }

    }
}
