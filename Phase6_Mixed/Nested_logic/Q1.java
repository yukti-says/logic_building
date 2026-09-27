package Phase6_Mixed.Nested_logic;

public class Q1 {
    public static void main(String[] args) {
        // 1. Print a multiplication table in a formatted grid (10x10).
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", (i * j));
            }
            System.out.println();
        }
    }
}
