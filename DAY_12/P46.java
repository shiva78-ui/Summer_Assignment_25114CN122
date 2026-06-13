import java.util.*;

public class P46 {
    public static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + (digit * digit * digit);
            n = n / 10;
        }
        if (sum == original)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if (isArmstrong(n)) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not armstrong number");
        }
    }
}
