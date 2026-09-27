package Phase4_Arrays.Level5_LogicalAndAppliedArrayProblems;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        // 1. Check if the array is sorted in ascending order.
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if(n == 0) {
            System.out.println("Array is empty.");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isSorted = true;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("Array is sorted in ascending order.");
        } else {
            System.out.println("Array is not sorted in ascending order.");
        }

        sc.close();
    }
}
