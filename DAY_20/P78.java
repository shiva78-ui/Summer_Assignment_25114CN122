import java.util.Scanner;

public class P78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        boolean isSymmetric = true;
        // note this condition
        if (rows != cols) {
            isSymmetric = false;
        } else {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    // note this condition
                    if (arr[i][j] != arr[j][i]) {
                        isSymmetric = false;
                    }
                }
            }
        }

        if (isSymmetric) {
            System.out.println("Symmetric Matrix");
        } else {
            System.out.println("Not a Symmetric Matrix");
        }

        sc.close();
    }
}