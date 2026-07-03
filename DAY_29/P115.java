import java.util.*;

public class P115 {

    static Scanner sc = new Scanner(System.in);
    static String str = ""; // Initializing Global variable to store the string

    // Methods
    static void enterString() {

        System.out.print("Enter New String: ");
        str = sc.nextLine();

        System.out.println("String Updated Successfully.");
    }

    static void displayString() {

        System.out.println("Current String: " + str);

    }

    static void stringLength() {

        System.out.println("Length of String = " + str.length());

    }

    static void toUpperCase() {

        String upper = str.toUpperCase();

        System.out.println("Uppercase String: " + upper);

    }

    static void toLowerCase() {

        String lower = str.toLowerCase();

        System.out.println("Lowercase String: " + lower);

    }

    static void reverseString() {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reverse = reverse + str.charAt(i);

        }

        System.out.println("Reversed String: " + reverse);

    }

    static void palindrome() {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reverse = reverse + str.charAt(i);

        }

        if (str.equalsIgnoreCase(reverse)) {

            System.out.println("String is Palindrome.");

        } else {

            System.out.println("String is Not Palindrome.");

        }

    }

    static void countVowels() {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                count++;

            }

        }

        System.out.println("Total Vowels = " + count);

    }

    static void countConsonants() {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = Character.toLowerCase(str.charAt(i));

            if (ch >= 'a' && ch <= 'z') {

                if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {

                    count++;

                }
            }
        }

        System.out.println("Total Consonants = " + count);

    }

    static void countWords() {

        if (str.trim().isEmpty()) {

            System.out.println("Total Words = 0");
            return;

        }

        String words[] = str.trim().split("\\s+");

        System.out.println("Total Words = " + words.length);

    }

    static void searchCharacter() {

        System.out.print("Enter Character to Search: ");
        char ch = sc.next().charAt(0);

        boolean found = false;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ch) {

                System.out.println("Character Found at Index " + i);
                found = true;
            }
        }

        if (!found) {

            System.out.println("Character Not Found.");

        }
    }

    static void replaceCharacter() {

        System.out.print("Enter Character to Replace: ");
        char oldChar = sc.next().charAt(0);

        System.out.print("Enter New Character: ");
        char newChar = sc.next().charAt(0);

        str = str.replace(oldChar, newChar);

        System.out.println("Updated String: " + str);

    }

    static void removeSpaces() {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {

                result = result + str.charAt(i);

            }

        }

        System.out.println("String Without Spaces: " + result);

    }

    static void compareStrings() {

        System.out.print("Enter Another String: ");
        String str2 = sc.nextLine();

        if (str.equals(str2)) {

            System.out.println("Both Strings are Equal.");

        } else {

            System.out.println("Both Strings are Not Equal.");

        }

    }

    static void concatenateString() {

        System.out.print("Enter Another String: ");
        String str2 = sc.nextLine();

        String result = str + str2;

        System.out.println("Concatenated String: " + result);

    }

    static void substring() {

        System.out.print("Enter Starting Index: ");
        int start = sc.nextInt();

        System.out.print("Enter Ending Index: ");
        int end = sc.nextInt();

        if (start >= 0 && end <= str.length() && start < end) {

            System.out.println("Substring: " + str.substring(start, end));

        } else {

            System.out.println("Invalid Index.");

        }
    }

    static void characterFrequency() {

        System.out.print("Enter Character: ");
        char ch = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ch) {

                count++;

            }
        }

        System.out.println("Frequency of " + ch + " = " + count);

    }

    static void countDigits() {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {

                count++;

            }
        }

        System.out.println("Total Digits = " + count);

    }

    static void countSpecialCharacters() {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (!(Character.isLetterOrDigit(ch) || ch == ' ')) {

                count++;

            }
        }

        System.out.println("Special Characters = " + count);

    }

    static void toggleCase() {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {

                result = result + Character.toLowerCase(ch);

            } else if (Character.isLowerCase(ch)) {

                result = result + Character.toUpperCase(ch);

            } else {

                result = result + ch;

            }
        }

        System.out.println("Toggle Case String: " + result);

    }

    static void checkAnagram() {

        System.out.print("Enter Another String: ");
        String str2 = sc.nextLine();

        String s1 = str.replace(" ", "").toLowerCase();
        String s2 = str2.replace(" ", "").toLowerCase();

        if (s1.length() != s2.length()) {

            System.out.println("Strings are Not Anagrams.");
            return;

        }

        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {

            System.out.println("Strings are Anagrams.");

        } else {

            System.out.println("Strings are Not Anagrams.");

        }

    }

    static void duplicateCharacters() {

        boolean found = false;

        System.out.println("Duplicate Characters:");

        for (int i = 0; i < str.length(); i++) {

            int count = 1;

            if (str.charAt(i) == ' ')
                continue;

            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {

                    count++;

                }
            }

            boolean printed = false;

            for (int k = 0; k < i; k++) {

                if (str.charAt(i) == str.charAt(k)) {

                    printed = true;
                    break;

                }
            }

            if (!printed && count > 1) {

                System.out.println(str.charAt(i) + " = " + count);
                found = true;

            }
        }

        if (!found) {

            System.out.println("No Duplicate Characters.");

        }

    }

    static void removeDuplicateCharacters() {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            boolean duplicate = false;

            for (int j = 0; j < result.length(); j++) {

                if (str.charAt(i) == result.charAt(j)) {

                    duplicate = true;
                    break;

                }
            }

            if (!duplicate) {

                result = result + str.charAt(i);

            }
        }

        System.out.println("String After Removing Duplicates: " + result);

    }

    public static void main(String[] args) {
        System.out.print("Enter String: ");
        str = sc.nextLine();

        while (true) {

            System.out.println("\n========== STRING OPERATION SYSTEM ==========");
            System.out.println("1. Enter String");
            System.out.println("2. Display String");
            System.out.println("3. Find Length");
            System.out.println("4. Convert to Uppercase");
            System.out.println("5. Convert to Lowercase");
            System.out.println("6. Reverse String");
            System.out.println("7. Check Palindrome");
            System.out.println("8. Count Vowels");
            System.out.println("9. Count Consonants");
            System.out.println("10. Count Words");
            System.out.println("11. Search Character");
            System.out.println("12. Replace Character");
            System.out.println("13. Remove Spaces");
            System.out.println("14. Compare Two Strings");
            System.out.println("15. Concatenate String");
            System.out.println("16. Find Substring");
            System.out.println("17. Character Frequency");
            System.out.println("18. Count Digits");
            System.out.println("19. Count Special Characters");
            System.out.println("20. Toggle Case");
            System.out.println("21. Check Anagram");
            System.out.println("22. Find Duplicate Characters");
            System.out.println("23. Remove Duplicate Characters");
            System.out.println("24. Exit");

            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    enterString();
                    break;
                case 2:
                    displayString();
                    break;
                case 3:
                    stringLength();
                    break;
                case 4:
                    toUpperCase();
                    break;
                case 5:
                    toLowerCase();
                    break;
                case 6:
                    reverseString();
                    break;
                case 7:
                    palindrome();
                    break;
                case 8:
                    countVowels();
                    break;
                case 9:
                    countConsonants();
                    break;
                case 10:
                    countWords();
                    break;
                case 11:
                    searchCharacter();
                    break;
                case 12:
                    replaceCharacter();
                    break;
                case 13:
                    removeSpaces();
                    break;
                case 14:
                    compareStrings();
                    break;
                case 15:
                    concatenateString();
                    break;
                case 16:
                    substring();
                    break;
                case 17:
                    characterFrequency();
                    break;
                case 18:
                    countDigits();
                    break;
                case 19:
                    countSpecialCharacters();
                    break;
                case 20:
                    toggleCase();
                    break;
                case 21:
                    checkAnagram();
                    break;
                case 22:
                    duplicateCharacters();
                    break;
                case 23:
                    removeDuplicateCharacters();
                    break;

                case 24:
                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}