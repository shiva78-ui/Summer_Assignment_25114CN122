import java.util.*;

public class P26 {
    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the number: ");
        int n = sc.nextInt();
        int fibo = fibonacci(n);
        System.out.println("The fibonacci series is " + fibo);
        sc.close();
    }
}