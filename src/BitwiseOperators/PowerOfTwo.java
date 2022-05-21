package BitwiseOperators;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(powerOfTwo(n));
    }

    private static boolean powerOfTwo(int n) {
        int count = 0;
        while (n > 0) {
            int ld = n & 1;
            if (ld == 1)
                count++;
            n = n >> 1;
        }
        return (count == 1);
    }
}
