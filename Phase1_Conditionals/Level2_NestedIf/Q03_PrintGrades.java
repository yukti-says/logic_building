//3 Take marks (0–100) and print the corresponding grade (A/B/C/D/F).

public class Q03_PrintGrades {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();

        if (marks >= 0 && marks <= 100) {
            if (marks >= 90) {
                System.out.println("Grade: A");
            } else if (marks >= 80) {
                System.out.println("Grade: B");
            } else if (marks >= 70) {
                System.out.println("Grade: C");
            } else if (marks >= 60) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F");
            }
        } else {
            System.out.println("Invalid marks. Please enter between 0 and 100.");
        }

        sc.close();
    }
}
