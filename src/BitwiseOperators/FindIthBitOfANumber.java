package BitwiseOperators;

public class FindIthBitOfANumber {
    public static void main(String[] args) {
        int n = 182;
        int i = 5;
        System.out.println(findIthBit(n, i));
    }

    private static int findIthBit(int n, int i) {
        return (n & (1 << (i -1)));
    }
}
