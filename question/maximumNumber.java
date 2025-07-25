package question;

// find the maximum element in an integer array

public class maximumNumber {
    public static void main(String []args){
        int arr[] = {5, 9, 2, 11, 7};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
        }

        System.out.print("this is max num : " + max);
    }
}
