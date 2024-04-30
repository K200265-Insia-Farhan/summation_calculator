import java.util.Scanner;

public class sumCalculator {
    public static String calculateSum(int a, int b) {
        if (a <= 0 || b <= 0) {
            return "Error";
        }
        int sum = a + b;
        if (sum > 100) {
            return String.valueOf(sum);
        } else if (sum == 100) {
            return String.valueOf(a * b);
        } else {
            return String.valueOf(Math.abs(a - b));
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two positive integers
        System.out.println("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Calculate the sum based on the input numbers
        String result = calculateSum(num1, num2);
        System.out.println("Result: " + result);

        scanner.close();
    }
}
