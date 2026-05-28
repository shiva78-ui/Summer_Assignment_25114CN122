import java.util.*;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the number");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println("The number of digits = " + count);
        sc.close();
    }
}
