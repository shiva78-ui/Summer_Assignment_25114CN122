import java.util.*;

public class P25 {
    public static long factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        long fact = factorial(n);
        System.out.println("The factorial of given number is " + fact);
        sc.close();
    }

}
