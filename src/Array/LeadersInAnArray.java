package Array;

import java.util.Stack;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 6, 5, 2};
        leaders(arr);
    }

    private static void leaders(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int i = arr.length -1;
        s.push(arr[i]);
        int gre = arr[i];
        i--;
        while (i >= 0) {
            if (arr[i] > gre) {
                s.push(arr[i]);
                gre = arr[i];
            }
            i--;
        }
        int size = s.size();
        for (int j = 0 ; j < size; j++) {
            System.out.print(s.pop() + " ");
        }
    }
}
