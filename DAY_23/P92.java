import java.util.Scanner;
/*  Logic 
1. Count the frequency of each character
2. Find the character with the highest frequency.
 */

public class P92 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Frequency array
        int freq[] = new int[256];

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        // Find maximum occurring character
        int max = 0;
        char maxChar = ' ';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (freq[ch] > max) {
                max = freq[ch];
                maxChar = ch;
            }
        }

        System.out.println("Maximum occurring character: " + maxChar);
        System.out.println("Frequency: " + max);

        sc.close();
    }
}