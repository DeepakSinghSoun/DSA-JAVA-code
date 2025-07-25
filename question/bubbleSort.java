package question;
import java.util.*;

// taks an array as input and return it sorted using bubble short

public class bubbleSort { 
    public static void main(String  []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        sort(arr);
        
        sc.close();
    }

    public static void sort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if(arr[j] >= arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}