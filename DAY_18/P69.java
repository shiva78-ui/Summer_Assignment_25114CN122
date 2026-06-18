import java.util.*;

public class P69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int pass = 0; pass < n - 1; pass++) {
            for (int i = 0; i < n - 1 - pass; i++) {
                if (arr1[i] > arr1[i + 1]) {
                    int temp = arr1[i + 1];
                    arr1[i + 1] = arr1[i];
                    arr1[i] = temp;
                }
            }

        }
        System.out.println("The array after bubble sort is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        sc.close();
    }

}