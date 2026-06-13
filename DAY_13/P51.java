import java.util.*;

public class P51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int num[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the size of array:");
            num[i] = sc.nextInt();

        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + num[i];
        }
        double avg = (double) sum / size;
        System.out.println(avg);
        sc.close();
    }
}