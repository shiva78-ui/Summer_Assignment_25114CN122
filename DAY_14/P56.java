import java.util.*;

public class P56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int num[] = new int[size];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("The duplicate elements are: ");
        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;
            // checks if the element appeared before
            for (int k = 0; k < i; k++) {

                if (num[i] == num[k]) {
                    isDuplicate = true;
                    break;
                }
                // it will not print the element if it appeared before
                if (isDuplicate) {
                    continue;
                }
            }
            // checks if the element appeares later
            for (int j = i + 1; j < size; j++) {
                if (num[i] == num[j]) {
                    System.out.println(num[i]);
                    break;
                }
            }
        }
        sc.close();
    }
}
