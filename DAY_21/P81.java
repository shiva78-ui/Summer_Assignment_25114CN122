import java.util.*;

public class P81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string character: ");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();// convert string to character array

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            count++;
        }

        System.out.println("Length of String = " + count);
    }
}