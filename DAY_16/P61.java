import java.util.*;

public class P61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int num[] = new int[n - 1]; // bcz one number is missing so one less space will be allocated
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        // What xor does = a^a= 0; a^0= a;
        // for total the elements in the size of array
        int xorAll = 0;
        for (int i = 1; i <= n; i++) {
            xorAll = xorAll ^ i;
        }
        // for actual elements present in the array
        int xorNum = 0;
        for (int i = 0; i < num.length; i++) {
            xorNum = xorNum ^ num[i];
        }

        int Missing = xorAll ^ xorNum;
        System.out.println("The missing element is: ");
        System.out.println(Missing);
        sc.close();

    }
}