public class pattern16 {
    public static void main(String[] args) {
        int n = 4;

        // Upper part of the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) { // Change from < to <=
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the pattern
        for (int i = n - 1; i >= 1; i--) { // Start from n-1 to avoid repeating the middle row
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) { // Change from < to <=
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
