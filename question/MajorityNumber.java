package question;

// Leet code question. `Level` : Easy

// find the majority element in the array

public class MajorityNumber {
    public static void main(String[] args) {
        int arr[] = {2, 2, 1, 1, 1, 2, 2};
        int n = arr.length;

        int count = 0;
        int candidate = -1;    

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > n / 2) {
            System.out.println("Majority element is: " + candidate);
        } else {
            System.out.println("No majority element found.");
        }
    }
}