// Q8 -> 8. Take a temperature value and print "Cold", "Warm", or "Hot" using range conditions.
package Phase1_Conditionals.Level1_SimpleConditions;

public class Q8 {
    public static void main(String[] args) {
        double temperature = 25.0; // You can change this value to test with different temperatures

        if (temperature < 10) {
            System.out.println("Cold");
        } else if (temperature >= 10 && temperature < 30) {
            System.out.println("Warm");
        } else {
            System.out.println("Hot");
        }
    }
}

