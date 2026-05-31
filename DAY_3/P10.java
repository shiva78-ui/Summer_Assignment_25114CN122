import java.util.*;

public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int A = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int B = sc.nextInt();
        for (int i = A; i <= B; i++) {
            boolean isPrime = true;
            if (i <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }

                }
            }
            if (isPrime) {
                System.out.println(i + " ");
            }
        }

    }

}
