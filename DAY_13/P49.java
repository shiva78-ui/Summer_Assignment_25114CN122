import java.util.*;

public class P49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int num[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element: ");
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(num[i] + " ");
        }
        sc.close();

    }
}
