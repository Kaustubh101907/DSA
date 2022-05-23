package BitwiseOperators;

public class NoOfSetBits {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(countSetBits(n));
    }

    private static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            int ld = n & 1;
            if (ld == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}
