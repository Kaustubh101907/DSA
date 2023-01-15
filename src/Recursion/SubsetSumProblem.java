package Recursion;

public class SubsetSumProblem {
    public static void main(String[] args) {
        int[] arr = {10, 5, 22, 3, 6, 2};
        int n = arr.length;
        int sum = 8;
        System.out.println(countSubsets(arr, n, sum));
    }

    private static int countSubsets(int[] arr, int n, int sum) {
        if (n == 0) {
            return (sum == 0) ? 1 : 0;
        }
        return countSubsets(arr, n-1, sum) + countSubsets(arr, n-1, sum - arr[n - 1]);
    }
}
