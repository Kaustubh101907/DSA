package Maths;

import java.util.ArrayList;

public class FactorsEff {
    public static void main(String[] args) {
        int n = 20;
        factors2(n);
        System.out.println();
        factor3(n);
    }

    // Time: O (sqrt(n))
    private static void factors2(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n/i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }
    }

    // Here both Time and space: O (sqrt(n))
    private static void factor3(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1 ; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n/i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size() -1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
