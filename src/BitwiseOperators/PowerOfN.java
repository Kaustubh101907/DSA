package BitwiseOperators;

public class PowerOfN {
    public static void main(String[] args) {
        int n = 3;
        int pow = 6;
        System.out.println(powerOfN(n, pow));
    }

    private static int powerOfN(int n, int pow) {
        int ans = 1;
        int base = n;
        while (pow > 0) {
            int ld = pow & 1;
            ans *= base;
            base *= base;
            pow = pow >> 1;
        }
        return ans;
    }
}
