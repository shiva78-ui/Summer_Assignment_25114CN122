import java.util.*;

public class P40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int space = n - i;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print((char) (64 + j));
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char) (64 + j));

            }
            System.out.println();

        }
        sc.close();
    }
}
