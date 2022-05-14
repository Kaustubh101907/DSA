package BitwiseOperators;

public class SetIthBit {
    public static void main(String[] args) {
        int n = 86;
        int i = 4;
        System.out.println(setIthBit(n, i));
    }

    private static int setIthBit(int n, int i) {
        return n | 1 << (i - 1);
    }
}
