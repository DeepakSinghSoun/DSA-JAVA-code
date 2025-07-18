package arrays;

//array nums return true if any value appears at least twice in the array 

public class twiceNumber {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 1};

        if (isTwice(arr)) {
            System.out.println("This array contains duplicate values.");
        } else {
            System.out.println("This array has no duplicates.");
        }
    }

    public static boolean isTwice(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
