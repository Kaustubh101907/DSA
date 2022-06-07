package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        int n = 101;
        System.out.println(isPalindrome(n));
    }

    private static boolean isPalindrome(int n) {
        return (n == reverse(n));
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
