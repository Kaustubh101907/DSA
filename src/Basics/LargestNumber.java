package Basics;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {6, 4, 12, 3, 19, 28, 7, 18};
        int largest = findLargest(arr);
        System.out.println(largest);
    }

    private static int findLargest(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i< arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
