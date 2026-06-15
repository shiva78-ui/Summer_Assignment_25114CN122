import java.util.*;

public class P58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int num[] = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        int first = num[0];
        for (int i = 0; i < size - 1; i++) {
            num[i] = num[i + 1];
        }
        num[size - 1] = first;
        System.out.println("The left rotated array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(num[i] + " ");
        }
        sc.close();
    }
}