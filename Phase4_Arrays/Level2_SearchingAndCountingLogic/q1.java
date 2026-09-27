package Phase4_Arrays.Level2_SearchingAndCountingLogic;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        // 1. Input an element x — check if it exists in the array.
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int x = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element exists in the array.");
        } else {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}
