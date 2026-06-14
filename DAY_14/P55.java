import java.util.*;

public class P55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int num[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the elements of the array: ");
            num[i] = sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (num[i] > largest) {
                secondlargest = largest;
                largest = num[i];
            } else if (num[i] > secondlargest && num[i] != largest) {
                secondlargest = num[i];
            }
        }
        System.out.println("The secondlargest number is: " + secondlargest);
        sc.close();
    }
}
