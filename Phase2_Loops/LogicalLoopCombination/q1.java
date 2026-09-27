package Phase2_Loops.LogicalLoopCombination;

public class q1 {
    public static void main(String[] args) {
        // 1. Print all numbers whose sum of digits is even (1–100).
        for (int i = 1; i <= 100; i++) {
            int sum = 0;
            int temp = i;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
