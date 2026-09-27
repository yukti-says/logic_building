package Phase3_Recursion.Level1_Foundation;

import java.util.Scanner;

public class q1 {
    public static void printNumbers(int n) {
        if (n == 0) return;
        printNumbers(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        // 1. Print numbers from 1 to n using recursion.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        printNumbers(n);
        System.out.println();
        sc.close();
    }
}
