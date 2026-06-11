import java.util.*;

public class P37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int space = n - i;//point to be noted
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            int star = 2 * i - 1;//point to be noted
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
