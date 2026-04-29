// Q5 ->5. Check if a given year is a leap year.

package Phase1_Conditionals.Level1_SimpleConditions;

public class Q5 {
    public static void main(String[] args) {
        int year = 2020; // You can change this value to test with different years

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}