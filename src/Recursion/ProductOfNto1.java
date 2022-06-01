package Recursion;

public class ProductOfNto1 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(productNto1(n));
    }

    private static int productNto1(int n) {
        if (n == 1) {
            return 1;
        }
        return n * productNto1(n -1);
    }
}
