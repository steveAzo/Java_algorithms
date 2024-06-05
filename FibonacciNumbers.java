import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Input should be a non-negative integer.");
        } else {
            int result = fibonacci(n);
            System.out.println("Fibonacci number " + n + " is " + result);
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
