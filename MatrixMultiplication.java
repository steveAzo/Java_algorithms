import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows of matrix A: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter the number of columns of matrix A (and rows of matrix B): ");
        int colsA = scanner.nextInt();
        System.out.print("Enter the number of columns of matrix B: ");
        int colsB = scanner.nextInt();

        int[][] A = new int[rowsA][colsA];
        int[][] B = new int[colsA][colsB];

        System.out.println("Enter the elements of matrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the elements of matrix B:");
        for (int i = 0; i < colsA; i++) {
            for (int j = 0; j < colsB; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        int[][] C = matrixMultiply(A, B);

        System.out.println("Resultant matrix C:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] matrixMultiply(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        int[][] C = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                C[i][j] = 0;
                for (int k = 0; k < colsA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return C;
    }
}
