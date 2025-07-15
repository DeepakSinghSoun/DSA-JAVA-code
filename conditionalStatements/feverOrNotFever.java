import java.util.*;

// find you have a fever or not fever

public class feverOrNotFever {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        double temp = 103.5;

        if (temp > 100){
            System.out.print("You have a fever");
        }else {
            System.out.print("You don't have a fever");
        }
    }
}