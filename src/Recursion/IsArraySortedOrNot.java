package Recursion;

public class IsArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5,6,7};
        int i = 0;
        System.out.println(isSortedEff(arr, i));
    }

    private static boolean isSortedEff(int[] arr, int i) {
        if (i == arr.length -1) {
            return true;
        }
        return arr[i] < arr[i+1] && isSortedEff(arr, i+1);
    }

    private static boolean isSorted(int[] arr, int i) {
        if (i == arr.length -1) {
            return true;
        }
        if (arr[i] > arr[i+1]) {
            return false;
        }
        return isSorted(arr,i+1);
    }
}
