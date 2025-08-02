package ArraysAndMatrices;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Dimensions for first matrix
        System.out.print("Enter number of rows of first matrix: ");
        int m = input.nextInt();
        System.out.print("Enter number of columns of first matrix: ");
        int n = input.nextInt();

        // Dimensions for second matrix
        System.out.print("Enter number of columns of second matrix: ");
        int p = input.nextInt();

        // Declare matrices
        int[][] A = new int[m][n];
        int[][] B = new int[n][p];
        int[][] product = new int[m][p];

        // Input for matrix A
        System.out.println("Enter elements of first matrix (" + m + "x" + n + "):");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                A[i][j] = input.nextInt();

        // Input for matrix B
        System.out.println("Enter elements of second matrix (" + n + "x" + p + "):");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < p; j++)
                B[i][j] = input.nextInt();

        // Multiply matrices
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    product[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Output result
        System.out.println("Product of the two matrices (" + m + "x" + p + "):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
