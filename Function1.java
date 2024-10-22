import java.util.Scanner;

public class Function1 {
    static int calculateSum(int a, int b) {
        int sum = a + b; // Calculate the sum of a and b
        return sum; // Return the calculated sum
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("The sum is: " + sum);
    }
}
