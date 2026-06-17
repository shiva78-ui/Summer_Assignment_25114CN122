import java.util.*;

public class P64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int index = 0;
        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                arr[index] = arr[i];
                index++;
            }

        }
        System.out.println("The array after removing the duplicates: ");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

}
