import java.util.Scanner;

public class P97 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first sorted string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second sorted string: ");
        String str2 = sc.nextLine();

        String result = "";

        int i = 0, j = 0;

        // Merge both strings
        while (i < str1.length() && j < str2.length()) {

            if (str1.charAt(i) <= str2.charAt(j)) {
                result = result + str1.charAt(i);
                i++;
            } else {
                result = result + str2.charAt(j);
                j++;
            }
        }

        // Add remaining characters of first string
        while (i < str1.length()) {
            result = result + str1.charAt(i);
            i++;
        }

        // Add remaining characters of second string
        while (j < str2.length()) {
            result = result + str2.charAt(j);
            j++;
        }

        System.out.println("Merged String: " + result);

        sc.close();
    }
}