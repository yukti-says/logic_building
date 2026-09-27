package Phase5_Strings.Level4_CharacterAndWordManipulation;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        // 1. Remove all vowels from a string.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            char lowerCh = Character.toLowerCase(ch);
            if (lowerCh != 'a' && lowerCh != 'e' && lowerCh != 'i' && lowerCh != 'o' && lowerCh != 'u') {
                result.append(ch);
            }
        }

        System.out.println("String without vowels: " + result.toString());

        sc.close();
    }
}
