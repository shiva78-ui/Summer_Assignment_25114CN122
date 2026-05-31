import java.util.*;

public class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int A = sc.nextInt();
        System.out.println("Enter the 2nd Number: ");
        int B = sc.nextInt();
        int gcd = 1;
        for (int i = 1; i <= A && i <= B; i++) {
            if (A % i == 0 && B % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD IS: " + gcd);
    }
}