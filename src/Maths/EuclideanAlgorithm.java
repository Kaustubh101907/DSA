package Maths;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        int a = 4;
        int b = 8;
        System.out.println(gcd(a, b));
    }

    private static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b%a, a);
    }
}
