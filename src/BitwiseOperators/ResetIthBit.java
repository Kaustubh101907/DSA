package BitwiseOperators;

public class ResetIthBit {
    public static void main(String[] args) {
        int n = 86;
        int i = 5;
        System.out.println(resetIthBit(n, i));
    }

    private static int resetIthBit(int n, int i) {
        int comp = (1 << (i-1));
        return n ^ comp;
    }
}
