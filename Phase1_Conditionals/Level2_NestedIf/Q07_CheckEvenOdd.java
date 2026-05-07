// 7  Take two numbers and determine whether both are even, both are odd, or one is even and one is odd.

public class Q07_CheckEvenOdd {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a % 2 == 0) {
            if (b % 2 == 0) {
                System.out.println("Both are even");
            } else {
                System.out.println("First is even, second is odd");
            }
        } else {
            if (b % 2 == 0) {
                System.out.println("First is odd, second is even");
            } else {
                System.out.println("Both are odd");
            }
        }

        sc.close();
    }
}
