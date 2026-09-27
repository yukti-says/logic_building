package Phase6_Mixed.Applied_Reasoning_RealLife;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // 1. Given marks of students, find how many passed (>= 40).
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int passed = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks for student " + i + ": ");
            int marks = sc.nextInt();
            if (marks >= 40) {
                passed++;
            }
        }

        System.out.println("Number of students passed: " + passed);

        sc.close();
    }
}
