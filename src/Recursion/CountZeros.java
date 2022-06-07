package Recursion;

public class CountZeros {
    public static void main(String[] args) {
        int n = 30204;
        System.out.println(countZeros(n));
    }

    private static int countZeros(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 10 == 0) {
            return 1 + countZeros(n/10);
        }
        return countZeros(n/10);
    }
}
