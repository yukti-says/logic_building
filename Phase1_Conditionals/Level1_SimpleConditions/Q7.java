// Q7 -> 7. Take three numbers and print the largest.
package Phase1_Conditionals.Level1_SimpleConditions;

public class Q7 {
    public static void main(String[] args) {
        int num1 = 10; // You can change these values to test with different numbers
        int num2 = 20;
        int num3 = 30;

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The largest number is: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The largest number is: " + num2);
        } else {
            System.out.println("The largest number is: " + num3);
        }
    }
}



// Compare all:

// Check if num1 is greater than both
// Else if num2 is greater than both
// Else num3 is largest