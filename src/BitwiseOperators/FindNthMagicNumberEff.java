package BitwiseOperators;

public class FindNthMagicNumberEff {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(nthMagicNo(n));
    }

    private static int nthMagicNo(int n) {
        int ans = 0;
        int base = 5;
        while (n > 0) {
            int ld = n & 1;
            n = n >> 1;
            ans += ld * base;
            base *= 5;
        }
        return  ans;
    }
}
