import java.util.*;

public class P75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of the matrix: ");
        int rows = sc.nextInt();
        System.out.println("Enter the coloums: ");
        int cols = sc.nextInt();
        int arr1[][] = new int[rows][cols];
        int transpose[][] = new int[cols][rows];/*
                                                 * Transpose of a matrix is obtained by interchanging
                                                 * the rows andcolumns of the original matrix.
                                                 */
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = arr1[i][j];
            }
        }
        System.out.println("The matrix after transpose is");
        // note this block of code
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        sc.nextInt();
    }
}