//8 Take an alphabet character and check if it lies between 'a' and 'm' or 'n' and 'z'.

public class Q08_Alphabets {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            if (ch >= 'a' && ch <= 'm') {
                System.out.println("Between a and m");
            } else if (ch >= 'n' && ch <= 'z') {
                System.out.println("Between n and z");
            } else {
                System.out.println("It's m or n? Wait, m is included in first, n in second.");
            }
        } else {
            System.out.println("Not a lowercase alphabet");
        }

        sc.close();
    }
}
