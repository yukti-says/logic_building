//9.  Take a number (1–7) and print the corresponding day of the week (1 for Monday, 2 for Tuesday, etc.).

public class Q09_DayName {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter number (1-7): ");
        int day = sc.nextInt();

        if (day >= 1 && day <= 7) {
            if (day == 1) {
                System.out.println("Monday");
            } else if (day == 2) {
                System.out.println("Tuesday");
            } else if (day == 3) {
                System.out.println("Wednesday");
            } else if (day == 4) {
                System.out.println("Thursday");
            } else if (day == 5) {
                System.out.println("Friday");
            } else if (day == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }
        } else {
            System.out.println("Invalid day number");
        }

        sc.close();
    }
}
