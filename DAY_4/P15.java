import java.util.*;

public class P15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        int original = n;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + (digit * digit * digit);
            n = n / 10;
        }
        if (sum == original) {
            System.out.println("The number is Armstrong number");
        } else {
            System.out.println("The number is not Armstrong number");
        }
        sc.close();
    }
}
