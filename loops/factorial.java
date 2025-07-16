import java.util.*;

public class factorial {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Factorial Number : ");
        int num = sc.nextInt();
        int fact = 1;

        for (int i = 1; i <= num; i++){
            fact *= i;
        }
        System.out.print("This is factorial : "+ fact);
    }
}
