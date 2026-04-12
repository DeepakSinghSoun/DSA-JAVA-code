package leetcode;

// Pow(x, n) (Midium)

public class Q50 {

    public static double myPow(double x, int n) {
        long power = n;
        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        double result = 1;

        while (power > 0) {
            if (power % 2 == 1) {
                result *= x;
            }

            x *= x;
            power /= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
        System.out.println(myPow(x, n));
    }
}