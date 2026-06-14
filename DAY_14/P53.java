import java.util.*;

public class P53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int num[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the elements of the array: ");
            num[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int n = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (num[i] == n) {
                System.out.println("Number found at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
        sc.close();
    }
}