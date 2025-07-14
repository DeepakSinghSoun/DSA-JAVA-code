import java.util.*;

// Bill of Items

public class billOfItems {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        int CostPen = 10;
        int CostPencil = 5;
        int CostEraser = 5;

        System.out.print("Enter the pencil and cost is 10 : ");
        float TotalPencil = sc.nextFloat();
        System.out.print("Enter the pen and cost is 5 : ");
        float TotalPen = sc.nextFloat();
        System.out.print("Enter the eraser and cost is 5 : ");
        float TotalEraser = sc.nextFloat();

        float pen = CostPen * TotalPen;
        float pencil = CostPencil * TotalPencil;
        float eraser = CostEraser * TotalEraser;

        float totalBill = pen + pencil + eraser;

        float taxBill = totalBill + (0.18f * totalBill);

        System.out.println("Total Item Bill is :" + totalBill);

        System.out.println("Bill with 18% tax : "+ taxBill);
    }
}