import java.util.Scanner;

public class P90 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Frequency array for ASCII characters
        int freq[] = new int[256];

        boolean found = false;

        // Find the first repeating character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            freq[ch]++;

            if (freq[ch] == 2) {
                System.out.println("First repeating character: " + ch);
                found = true;
                break;
            }
        }

        // If no repeating character exists
        if (!found) {
            System.out.println("No repeating character found.");
        }

        sc.close();
    }
}