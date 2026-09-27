package Phase3_Recursion.Level3_PatternAndPrintingProblems;

import java.util.Scanner;

public class q1 {
    public static void printStars(int n) {
        if (n == 0) return;
        System.out.print("* ");
        printStars(n - 1);
    }

    public static void main(String[] args) {
        // 1. Print a line of n stars recursively.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        printStars(n);
        System.out.println();
        sc.close();
    }
}
