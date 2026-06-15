import java.util.*;

public class P57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int num[] = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        int start = 0;
        int end = size - 1;
        while (start < end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
        System.err.println("The reversed array is");
        for (int i = 0; i < size; i++) {
            System.out.print(num[i] + " ");
        }
        sc.close();
    }
}
