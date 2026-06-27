import java.util.Scanner;

public class P94 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String compressed = "";
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressed = compressed + str.charAt(i) + count;
                count = 1;
            }
        }

        // Add the last character
        compressed = compressed + str.charAt(str.length() - 1) + count;

        System.out.println("Compressed String: " + compressed);

        sc.close();
    }
}