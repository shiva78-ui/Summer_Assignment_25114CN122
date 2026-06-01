import java.util.*;

public class P14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term:");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int next = 0;
        if (n == 1) {
            System.out.println(a);
        } else if (n == 2) {
            System.out.println(b);
        } else {
            for (int i = 3; i <= n; i++) {
                next = a + b;
                a = b;
                b = next;
            }
            System.out.println("The value of nth term is: " + next);
            sc.close();
        }

    }
}
