package Recursion;

import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4, 5};
        int target = 18;
        int i = 0;
//      System.out.println(isPresent(arr, target, i));
//      System.out.println(linearSearch(arr, target, i));
//      linearSearchAllIndex(arr, target, i);
//      System.out.println();
//      findAllIndex(arr, target, i);
//      System.out.println(list);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = findAllIndex(arr, 4, 0, list);
        System.out.println(ans);
        System.out.println(list);
        System.out.println(findAllIndex2(arr, 4, 0));
    }

    private static void linearSearchAllIndex(int[] arr, int target, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == target) {
            System.out.print(i + " ");
        }
        linearSearchAllIndex(arr, target, i+1);
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

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }

    private static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }

    private static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        // this will contain ans for that fun call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
