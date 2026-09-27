package Phase5_Strings.Level1_Basics;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        // 1. Take a string input and print its length.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Length of string: " + str.length());

        sc.close();
    }
}
