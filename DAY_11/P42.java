import java.util.*;

public class P42 {

    public static int maximum(int n, Scanner sc) {
        int max = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            int num = sc.nextInt();

            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");

        int ans = maximum(n, sc);

        System.out.println("Maximum = " + ans);
    }
}