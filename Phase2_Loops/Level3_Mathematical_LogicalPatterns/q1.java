package Phase2_Loops.Level3_Mathematical_LogicalPatterns;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        // 1. Print the squares of numbers from 1 to n.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print((i * i) + " ");
        }
        System.out.println();
        sc.close();
    }
}
