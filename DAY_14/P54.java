import java.util.*;

public class P54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int num[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element of array: ");
            num[i] = sc.nextInt();
        }
        System.out.println("Enter the element whose frequency is to be find: ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (num[i] == n) {
                count++;
            }
        }
        System.out.println("The frequency of " + n + " is " + count);
        sc.close();

    }
}
