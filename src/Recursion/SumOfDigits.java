package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(sumOfDigits(n));
    }

    private static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        int ld = n % 10;
        return ld + sumOfDigits(n/10);
    }
}
