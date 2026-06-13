import java.util.*;

public class P47 {
    public static void fibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {

            System.out.println(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        fibonacci(n);
        sc.close();
    }
}
