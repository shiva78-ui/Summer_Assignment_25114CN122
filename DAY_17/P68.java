import java.util.*;

public class P68 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of first array: ");
        int n = sc.nextInt();

        int arr1[] = new int[n];

        System.out.println("Enter the elements of first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of second array: ");
        int m = sc.nextInt();

        int arr2[] = new int[m];

        System.out.println("Enter the elements of second array:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("The common elements in the array are: ");
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < i; k++) {

                if (arr1[i] == arr1[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                continue;
            }
            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }

        sc.close();
    }
}