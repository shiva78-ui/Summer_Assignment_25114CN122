import java.util.*;

public class P66 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // First Array Input
        System.out.print("Enter the size of first array: ");
        int n = sc.nextInt();

        int arr1[] = new int[n];

        System.out.println("Enter the elements of first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // Second Array Input
        System.out.print("Enter the size of second array: ");
        int m = sc.nextInt();

        int arr2[] = new int[m];

        System.out.println("Enter the elements of second array:");
        for (int j = 0; j < m; j++) {
            arr2[j] = sc.nextInt();
        }

        // Merge Arrays
        int arr3[] = new int[n + m];
        int index = 0;

        for (int i = 0; i < n; i++) {
            arr3[index] = arr1[i];
            index++;
        }

        for (int j = 0; j < m; j++) {
            arr3[index] = arr2[j];
            index++;
        }

        System.out.println("Merged Array:");
        for (int k = 0; k < index; k++) {
            System.out.print(arr3[k] + " ");
        }

        // Union Logic
        int union[] = new int[n + m];
        int unionIndex = 0;

        for (int i = 0; i < index; i++) {

            boolean isDuplicate = false;

            for (int j = 0; j < unionIndex; j++) {

                if (arr3[i] == union[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                union[unionIndex] = arr3[i];
                unionIndex++;
            }
        }

        System.out.println("\nUnion of Arrays:");

        for (int i = 0; i < unionIndex; i++) {
            System.out.print(union[i] + " ");
        }

        sc.close();
    }
}