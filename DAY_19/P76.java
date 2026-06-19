import java.util.Scanner;

public class P76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of cols: ");
        int cols = sc.nextInt();

        if (rows != cols) {
            System.out.println("No solution. Matrix is not square.");
            return;// it helps to directly ends the program
        }

        int[][] arr = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;

        for (int i = 0; i < rows; i++) {
            sum = sum + arr[i][i];
        }

        System.out.println("Sum of diagonal elements = " + sum);

        sc.close();
    }
}