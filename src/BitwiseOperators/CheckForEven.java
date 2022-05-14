package BitwiseOperators;

public class CheckForEven {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isEven(n));
    }

    public static boolean isEven(int n) {
        return ((n & 1) == 0);
    }
}
