import java.util.*;

public class P16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int start = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            int n = i;
            int original = n;
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum = sum + (digit * digit * digit);
                n = n / 10;

            }
            if (sum == original) {
                System.out.println(original);
            }

        }
        sc.close();
    }

}
