import java.util.Scanner;

public class CountingBinaryDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Input should be a non-negative integer.");
        } else {
            int result = countBinaryDigits(n);
            System.out.println("Number of binary digits: " + result);
        }
    }

    public static int countBinaryDigits(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 2;
            count++;
        }
        return count;
    }
}
