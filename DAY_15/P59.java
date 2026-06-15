import java.util.*;

public class P59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int num[] = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        int last = num[size - 1];
        for (int i = size - 1; i > 0; i--) {
            num[i] = num[i - 1];
        }
        num[0] = last;
        System.out.println("The right rotated array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(num[i] + " ");
        }
        sc.close();
    }
}
