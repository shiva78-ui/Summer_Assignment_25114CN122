import java.util.*;

public class P23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            int rem = n % 2;
            if (rem == 1) {
                count++;
            }
            n = n / 2;
        }
        System.out.println("Number of bits in a given number is " + count);
        sc.close();
    }
}