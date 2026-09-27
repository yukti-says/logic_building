package Phase6_Mixed.Number_Based_Logical_Comnination;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // 1. Print all numbers between 1 and N that are divisible by both 3 and 5.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.print("Numbers divisible by 3 and 5: ");
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        sc.close();
    }
}
