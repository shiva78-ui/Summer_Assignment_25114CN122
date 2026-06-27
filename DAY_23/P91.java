import java.util.Scanner;
//An anagram means two strings contain the same characters with the same frequency, but the order can be different.

public class P91 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Check length first
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        int freq[] = new int[256];

        // Increase frequency for first string
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            freq[ch]++;
        }

        // Decrease frequency for second string
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            freq[ch]--;
        }

        // Check whether all frequencies are zero
        boolean isAnagram = true;

        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("Strings are Anagrams.");
        } else {
            System.out.println("Strings are Not Anagrams.");
        }

        sc.close();
    }
}