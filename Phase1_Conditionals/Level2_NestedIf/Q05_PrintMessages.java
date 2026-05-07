//5  Take the hour of the day (0–23) and print "Good Morning", "Good Afternoon", "Good Evening", or "Good Night".

public class Q05_PrintMessages {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter hour (0-23): ");
        int hour = sc.nextInt();

        if (hour >= 0 && hour <= 23) {
            if (hour >= 0 && hour <= 11) {
                System.out.println("Good Morning");
            } else if (hour >= 12 && hour <= 16) {
                System.out.println("Good Afternoon");
            } else if (hour >= 17 && hour <= 20) {
                System.out.println("Good Evening");
            } else {
                System.out.println("Good Night");
            }
        } else {
            System.out.println("Invalid hour. Please enter between 0 and 23.");
        }

        sc.close();
    }
}
