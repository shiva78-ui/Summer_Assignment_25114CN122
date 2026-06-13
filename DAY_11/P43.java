import java.util.*;

public class P43 {
    public static boolean isprime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        if (isprime(n)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
}