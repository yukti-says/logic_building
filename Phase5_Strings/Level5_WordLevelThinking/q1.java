package Phase5_Strings.Level5_WordLevelThinking;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        // 1. Print each word of a sentence on a new line.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String[] words = str.split("\\s+");
        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.println(word);
            }
        }

        sc.close();
    }
}
