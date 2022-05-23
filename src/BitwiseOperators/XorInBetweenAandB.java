package BitwiseOperators;

public class XorInBetweenAandB {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        System.out.println(XorBetween(a, b));
    }

    private static int XorBetween(int a, int b) {
        int n = XorInRange(a -1);
        int m = XorInRange(b);
        return n ^ m;
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
