package Array;

import java.util.Arrays;

public class RotateArrayByD {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 3;
        arr = rotateD(arr, d);
        System.out.println(Arrays.toString(arr));
    }

    // Method 1
    // theta n+d time (or just Theta n as d is smaller) and theta 1 aux space
    private static int[] rotateD1(int[] arr, int d) {
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i < arr.length; i++) {
            arr[i - d] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            arr[arr.length - d+ i] = temp[i];
        }
        return arr;
    }

    // Method 2;
    // time complexity = theta n
    // Aux space = Theta 1
    private static int[] rotateD(int[] arr, int d) {
        reverse(arr,0, d - 1);
        reverse(arr,d, arr.length -1);
        reverse(arr,0, arr.length -1);
        return arr;
    }

    private static void reverse(int[] arr, int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
