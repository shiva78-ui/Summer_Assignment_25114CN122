import java.util.*;

public class P52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int num[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the elements of array: ");
            num[i] = sc.nextInt();
        }
        int Evencount = 0;
        int Oddcount = 0;
        for (int i = 0; i < size; i++) {
            if (num[i] % 2 == 0) {
                Evencount++;
            } else {
                Oddcount++;
            }
        }
        System.out.println("Even count: " + Evencount);
        System.out.println("Odd count: " + Oddcount);
        sc.close();
    }
}
