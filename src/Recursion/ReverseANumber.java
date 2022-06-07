package Recursion;

public class ReverseANumber {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(reverse(n));
    }

    private static int reverse(int n) {
        if (n == 0) {
            return 0;
        }
        int rev = 0;
        rev += n%10;
        int dig = (int)Math.floor(Math.log10(n));
        int digg = (int)Math.pow(10, dig);
        return (rev * digg) + reverse(n/10);
    }
}
