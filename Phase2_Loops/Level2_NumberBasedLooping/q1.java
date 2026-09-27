package Phase2_Loops.Level2_NumberBasedLooping;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        // 1. Count the number of digits in a given number.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        if (num == 0) {
            count = 1;
        } else {
            int temp = num;
            while (temp != 0) {
                count++;
                temp /= 10;
            }
        }

        System.out.println("Number of digits: " + count);
        sc.close();
    }
}
