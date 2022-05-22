package BitwiseOperators;

public class PowerOfTwoEff {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(powerOfTwo(n));
    }

    private static boolean powerOfTwo(int n) {
        return ((n & (n -1)) == 0);
    }
}
