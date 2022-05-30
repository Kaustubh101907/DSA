package Maths;

public class NewtonRaphsonMethod {
    public static void main(String[] args) {
        int n = 36;
        System.out.println(nrmSqrt(n));
    }

    private static double nrmSqrt(int n) {
        double x = n;
        double root;
        while (true) {
            root = 0.5 * (x + (n/x));
            if (Math.abs(root - x) < 1) { // the more you decrease 1, the more precision will be there
                break;
            }
            x = root;
        }
        return root;
    }
}
