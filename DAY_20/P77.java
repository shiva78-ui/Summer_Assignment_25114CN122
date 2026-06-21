import java.util.*;

public class P77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of 1st matrix: ");
        int rows1 = sc.nextInt();
        System.out.println("Enter the cols of 1st matrix: ");
        int cols1 = sc.nextInt();
        int A[][] = new int[rows1][cols1];
        System.out.println("Enter the rows of 2st matrix: ");
        int rows2 = sc.nextInt();
        if (cols1 != rows2) {
            System.out.println("Matric multiplication not possible: ");
            return;
        }
        System.out.println("Enter the cols of 2st matrix: ");
        int cols2 = sc.nextInt();
        int B[][] = new int[rows2][cols2];
        System.out.println("Enter the elements 1st matrix: ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                A[i][j] = sc.nextInt();
            }

        }
        System.out.println("Enter the elements of 2nd matrix: ");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        int C[][] = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                // this line is used bcz k tranverse for both rows and cols
                for (int k = 0; k < cols1; k++) {
                    C[i][j] += A[i][k] * B[k][i]; // bcz cols1 = rows2
                }
            }
        }
        System.out.println("The matrix multiplication is: ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}