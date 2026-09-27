package Phase3_Recursion.Level4_StringBasedRecursion;

import java.util.Scanner;

public class q1 {
    public static String reverseString(String s) {
        if (s.isEmpty()) return s;
        return reverseString(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        // 1. Reverse a string using recursion.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Reversed string: " + reverseString(s));
        sc.close();
    }
}
