package BitwiseOperators;

public class FindNthMagicNumber {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(nthMagicNo(n));
    }

    private static int nthMagicNo(int n) {
        String bit = Integer.toBinaryString(n);
        char[] arr = bit.toCharArray();
        int ans = 0;
        int j = 1;
        for (int i = arr.length -1; i >= 0 ; i--) {
            int k = arr[i] - 48;
            ans += k * (Math.pow(5,j));
            j++;
        }
        return  ans;
    }
}
