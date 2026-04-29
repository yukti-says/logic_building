 // Q4 -> 4. Check if a number is divisible by both 3 and 5.
 package Phase1_Conditionals.Level1_SimpleConditions;

public class Q4 {
    public static void main(String[] args) {
        int number = 15; // You can change this value to test with different numbers

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("The number is divisible by both 3 and 5.");
        } else {
            System.out.println("The number is not divisible by both 3 and 5.");
        }
    }
}
