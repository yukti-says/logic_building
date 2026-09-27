package Phase4_Arrays.Level4_AggregateAndComparativeThinking;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        // 1. Compare two arrays — check if they are equal (same elements & order).
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size for both arrays: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        System.out.println("Enter elements for array 1:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = new int[n];
        System.out.println("Enter elements for array 2:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        boolean areEqual = true;
        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                areEqual = false;
                break;
            }
        }

        if (areEqual) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }

        sc.close();
    }
}
