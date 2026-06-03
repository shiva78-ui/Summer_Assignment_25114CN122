import java.util.*;

public class P24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int n = sc.nextInt();
        System.out.println("Enter the power: ");
        int x = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result = result * n;
        }
        System.out.println("The result is " + result);
        sc.close();
    }
}