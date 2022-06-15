package Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,9};
        int target = 9;
        int i = 0;
        System.out.println(isPresent(arr, target, i));
        System.out.println(linearSearch(arr, target, i));
    }

    private static boolean isPresent(int[] arr, int target, int i) {
        if (i == arr.length) {
            return false;
        }
        return  arr[i] == target || isPresent(arr, target, i+1);
    }

    private static int linearSearch(int[] arr, int target, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return linearSearch(arr, target, i+1);
    }
}
