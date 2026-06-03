import java.util.*;

public class P27 {
    public static int sum(int n) {
        if (n == 0)
            return 0;
        return (n % 10) + sum(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int ans = sum(n);
        System.out.println("The sum of digits is " + ans);
        sc.close();
    }
}