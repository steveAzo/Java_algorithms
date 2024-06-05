import java.util.Scanner;

public class GaussianElimination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of variables: ");
        int n = scanner.nextInt();
        double[][] A = new double[n][n + 1];

        System.out.println("Enter the augmented matrix coefficients:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                A[i][j] = scanner.nextDouble();
            }
        }

        double[] result = gaussianElimination(A);

        System.out.println("Solution:");
        for (int i = 0; i < n; i++) {
            System.out.println("Variable " + (i + 1) + ": " + result[i]);
        }
    }

    public static double[] gaussianElimination(double[][] A) {
        int n = A.length;

        for (int i = 0; i < n; i++) {
            // Partial pivoting
            for (int k = i + 1; k < n; k++) {
                if (Math.abs(A[i][i]) < Math.abs(A[k][i])) {
                    double[] temp = A[i];
                    A[i] = A[k];
                    A[k] = temp;
                }
            }

            // Forward elimination
            for (int j = i + 1; j < n; j++) {
                double factor = A[j][i] / A[i][i];
                for (int k = i; k <= n; k++) {
                    A[j][k] -= factor * A[i][k];
                }
            }
        }

        // Back substitution
        double[] result = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            result[i] = A[i][n];
            for (int j = i + 1; j < n; j++) {
                result[i] -= A[i][j] * result[j];
            }
            result[i] /= A[i][i];
        }

        return result;
    }
}
