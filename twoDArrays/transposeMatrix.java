package twoDArrays;
import java.util.*;

// transpose of a matrix is the swapping the rows to columns .

public class transposeMatrix {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row : ");
        int row = sc.nextInt();
        System.out.print("Enter the Column : ");
        int columns = sc.nextInt();

        int matrix[][] = new int[row][columns];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < columns; j++){
                System.out.print("Enter value for [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        System.out.println();
        }

        System.out.println("\nTranspose Matrix:");
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < row; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}