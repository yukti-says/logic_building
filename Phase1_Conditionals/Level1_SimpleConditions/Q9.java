// Q9-> 9. Take a character and check if it's a vowel or consonant.

package Phase1_Conditionals.Level1_SimpleConditions;

public class Q9 {
    public static void main(String[] args) {
        char ch = 'a'; // You can change this value to test with different characters

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("The character is a vowel.");
        } else {
            System.out.println("The character is a consonant.");
        }
    }
}


