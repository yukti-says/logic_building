//1. Take three sides and check if they form a valid triangle
public class Q01_ValidTriangle {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter side 1: ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter side 2: ");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter side 3: ");
        int c = sc.nextInt();
        sc.nextLine();

              if (a + b > c) {
            if (b + c > a) {
                if (a + c > b) {
                    System.out.println("The sides form a valid triangle.");
                } else {
                    System.out.println("The sides do not form a valid triangle.");
                }
            } else {
                System.out.println("The sides do not form a valid triangle.");
            }
        } else {
            System.out.println("The sides do not form a valid triangle.");
        }
        
        sc.close();
    }

}
