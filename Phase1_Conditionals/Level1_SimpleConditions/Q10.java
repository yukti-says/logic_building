// Q10 -> 10. Take a character and check whether it's uppercase, lowercase, a digit, or a special character

package Phase1_Conditionals.Level1_SimpleConditions;

public class Q10 {
    public static void main(String[] args) {
        char ch = 'A'; // You can change this value to test with different characters   

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("The character is uppercase.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("The character is lowercase.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("The character is a digit.");
        } else {
            System.out.println("The character is a special character.");
        }
    }
}



            
