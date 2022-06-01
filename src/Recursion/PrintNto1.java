package Recursion;

public class PrintNto1 {
    public static void main(String[] args) {
        int n = 5;
        printNto1(n);
    }

    private static void printNto1(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNto1(n - 1);
    }
}
