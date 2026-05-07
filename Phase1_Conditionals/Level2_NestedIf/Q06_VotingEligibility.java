//6 Check voting eligibility for a given age (18+).

public class Q06_VotingEligibility {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age > 0) {
            if (age >= 18) {
                System.out.println("Eligible to vote");
            } else {
                System.out.println("Not eligible to vote");
            }
        } else {
            System.out.println("Invalid age");
        }

        sc.close();
    }
}
