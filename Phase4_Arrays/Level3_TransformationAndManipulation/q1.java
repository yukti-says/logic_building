package Phase4_Arrays.Level3_TransformationAndManipulation;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        // 1. Create a new array containing squares of all numbers.
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] squares = new int[n];
        for (int i = 0; i < n; i++) {
            squares[i] = arr[i] * arr[i];
        }

        System.out.print("Squared elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(squares[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
