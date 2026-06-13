import java.util.*;

public class P50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int num[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the elements of array: ");
            num[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + num[i];
        }
        System.out.print("The sum of array is: " + sum);
        sc.close();
    }
}
