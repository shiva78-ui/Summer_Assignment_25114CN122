import java.util.Scanner;

public class P98 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        int freq[] = new int[256];

        // Mark characters of first string
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            freq[ch] = 1;
        }

        System.out.print("Common Characters: ");

        // Check characters of second string
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);

            if (freq[ch] == 1) {
                System.out.print(ch + " ");
                freq[ch] = 2; // Prevent duplicate printing
            }
        }

        sc.close();
    }
}