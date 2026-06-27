import java.util.Scanner;

public class P89 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Create a frequency array for ASCII characters
        int freq[] = new int[256];

        // Count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        // Find the first non-repeating character
        boolean found = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (freq[ch] == 1) {
                System.out.println("First non-repeating character: " + ch);
                found = true;
                break;
            }
        }

        // If no non-repeating character exists
        if (!found) {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }
}