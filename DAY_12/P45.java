import java.util.*;

public class P45 {
    public static boolean isPalindrome(int n, int rev) {
        int original = n;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        if (rev == original) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = sc.nextInt();
        if (isPalindrome(n, 0)) {
            System.out.println("number is palindrome");
        } else {
            System.out.println("Nummber is not palindrome");
        }
        sc.close();
    }
}