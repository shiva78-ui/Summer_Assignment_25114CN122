import java.util.*;

public class P22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int result = 0;
        int i = 0;
        while (n > 0) {
            int digit = n % 10;
            result = result + digit * (int) Math.pow(2, i);
            i++;
            n = n / 10;
        }
        System.out.println("The result of binary to decimal is " + result);
    }
}