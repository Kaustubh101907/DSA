package Maths;

public class SquareRootOfANumber {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;
        System.out.println(sqrtx(n, p));
        // pretty printing
        System.out.printf("%.3f", sqrtx(n, p));
    }

    private static double sqrtx(int n, int p) {
        int start = 1;
        int end = n;
        double root = 0.0;
        while (start <= end) {
            int mid = start + (end - start)/2;
            int ans = mid * mid;
            if (ans == n) {
                return mid;
            }
            if (ans > n) {
                end = mid -1;
            } else {
                start = mid +1;
            }
        }
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }
}
