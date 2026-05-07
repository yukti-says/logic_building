//10.  Take a month number (1–12) and print the number of days in that month (ignore leap years).

public class Q10_NumberOfDaysInMonth {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        if (month >= 1 && month <= 12) {
            if (month == 2) {
                System.out.println("28 days");
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println("30 days");
            } else {
                System.out.println("31 days");
            }
        } else {
            System.out.println("Invalid month number");
        }

        sc.close();
    }
}
