package BitwiseOperators;

public class XorInRangeOf0ToA {
    public static void main(String[] args) {
        int a = 3;
        System.out.println(XorInRange(a));
    }

    private static int XorInRange(int a) {
        int n = a % 4;
        if (n == 0) {
            return a;
        } else if (n == 1) {
            return  1;
        } else if (n == 2) {
            return  a + 1;
        } else {
            return 0;
        }
    }
}
