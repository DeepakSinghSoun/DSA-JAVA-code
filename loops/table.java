import java.util.*;

// Table of a number

public class table {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number which table your print : ");
        int num = sc.nextInt();

        System.out.print("Enter the Number. how much your print the table : ");
        int total = sc.nextInt();

        for (int i = 1; i <= total; i++){
            int table = num * i;
            System.out.println(num + " * " + i + " = " + table );
        } 
    }
}
