package BitwiseOperators;

public class PositionOfRightmostSetBit {
    public static void main(String[] args) {
        int n = 182;
        System.out.println(findRightmostBit(n));
    }

    private static int findRightmostBit(int n) {
        int neg = (n ^ 1) +1;
        return n & neg;
    }
}
