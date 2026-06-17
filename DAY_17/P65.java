import java.util.*;

public class P65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        System.out.println("Enter the size of 2nd array: ");
        int m = sc.nextInt();
        int arr2[] = new int[m];
        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the 2nd array: ");
        for (int j = 0; j < m; j++) {
            arr2[j] = sc.nextInt();
        }
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
        System.out.println("The merged array is: ");
        for (int k = 0; k < index; k++) {
            System.out.print(arr3[k] + " ");
        }
        sc.close();

    }
}
