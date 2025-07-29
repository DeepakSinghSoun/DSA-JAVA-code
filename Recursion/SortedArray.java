package Recursion;

// check if array is sorted or not

public class SortedArray{
    public static void main(String []args){
        int num[] = {1, 2, 4, 5};
        System.out.print(isSortArr(num, 0));
    }

    public static boolean isSortArr(int num[],int i){
        if (i == num.length-1) return true;
        if(num[i] > num[i+1]) return false;

        return isSortArr(num, i+1);
    }
}