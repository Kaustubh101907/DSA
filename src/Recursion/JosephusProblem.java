package Recursion;

public class JosephusProblem {
    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        System.out.println(jop(n,k));
    }

    private static int jop(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (jop(n-1, k) +k) % n;
    }
}
