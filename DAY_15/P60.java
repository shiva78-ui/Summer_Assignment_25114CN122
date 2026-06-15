import java.util.*;

public class P60 {
    public static void MoveZeroesToEnd(int size, int[] num) {

        int index = 0;
        for (int i = 0; i < size; i++) {
            if (num[i] != 0) {
                num[index] = num[i];
                index++;
            }
        }
        while (index < size) {
            num[index] = 0;
            index++;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int num[] = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        MoveZeroesToEnd(size, num);
        System.out.println("After moving zeroes to end: ");
        for (int i = 0; i < size; i++) {
            System.out.print(num[i] + " ");
        }
        sc.close();
    }
}
