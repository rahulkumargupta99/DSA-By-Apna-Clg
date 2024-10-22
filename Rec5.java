public class Rec5 {

    public static int calcPower(int x, int n) {
        // Base cases
        if (n == 0) {
            return 1; // x^0 = 1 for any x
        }
        if (n == 1) {
            return x; // x^1 = x
        }
        // Recursive step
        int xPowernm1 = calcPower(x, n - 1);
        int xPowern = x * xPowernm1;
        return xPowern;
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = calcPower(x, n);
        System.out.println(ans); // Output should be 32, because 2^5 = 32
    }
}
