import java.util.*;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();
        int multi = 1;
        for (int i = 1; i <= 10; i++) {
            multi = multi * i;
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        sc.close();

    }
}
