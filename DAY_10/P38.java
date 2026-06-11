import java.util.*;

public class P38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) { // point to be noted for reverse pyramid
            int space = n - i;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            int star = 2 * i - 1;
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}