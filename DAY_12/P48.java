import java.util.*;

public class P48 {
    public static boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if (isPerfectNumber(n)) {
            System.out.println("It is perfect number");
        } else {
            System.out.println("It is not the perfect number");
        }
        sc.close();

    }
}