package Phase2_Loops.Level4_PatternPrintingStarsAndNumbers;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        // Basic pattern printing: right-aligned triangle
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
