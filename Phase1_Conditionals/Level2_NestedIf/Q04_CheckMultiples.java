//4 Check if one of two given numbers is a multiple of the other.

public class Q04_CheckMultiples {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a != 0 && b != 0) {
            if (a % b == 0) {
                System.out.println(a + " is a multiple of " + b);
            } else if (b % a == 0) {
                System.out.println(b + " is a multiple of " + a);
            } else {
                System.out.println("Neither is a multiple of the other");
            }
        } else {
            System.out.println("Numbers cannot be zero");
        }

        sc.close();
    }
}
