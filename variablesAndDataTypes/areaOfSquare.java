import java.util.*;

// Area of a Square

public class areaOfSquare {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int area = num*num;
        System.out.print("Area of Square is :" + area);
        sc.close();
    }
}