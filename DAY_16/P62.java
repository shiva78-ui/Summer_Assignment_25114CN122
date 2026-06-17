import java.util.*;

public class P62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int maxfreq = 0;
        int maxElement = arr[0];
        for (int i = 0; i < size; i++) {
            int count = 0;
            for (int j = 0; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }

            }
            if (count > maxfreq) {
                maxfreq = count;
                maxElement = arr[i];
            }
        }
        System.out.println("The maximum frequency is: " + maxfreq);
        System.out.println("The maximum frequency element is: " + maxElement);
        sc.close();
    }
}
