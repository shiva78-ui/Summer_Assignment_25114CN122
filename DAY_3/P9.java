import java.util.*;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = sc.nextInt();
    boolean isPrime = true;
    if (n <= 1) {
        isPrime = false;
    } else {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
    }
    if (isPrime) {
        System.out.println("The given number is prime number ");
    } else {
        System.out.println("The given number is not prime");
    }
    sc.close();
}