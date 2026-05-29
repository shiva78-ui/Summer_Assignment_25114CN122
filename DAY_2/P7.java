import java.util.*;

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int pro = 1;
        while (n > 0) {
            int digit = n % 10;
            pro = pro * digit;
            n = n / 10;
        }
        System.out.println("The product of digit is " + pro);
        sc.close();
    }
}
