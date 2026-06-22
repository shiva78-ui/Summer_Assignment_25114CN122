import java.util.*;

public class P86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        // trim() is used to remove the starting and ending spaces from the string
        String str = sc.nextLine().trim();

        int words = 0;

        for (int i = 0; i < str.length(); i++) {
            // this is the main condition to count the number of words in the string
            if (i == 0 || (str.charAt(i) != ' ' && str.charAt(i - 1) == ' ')) {
                words++;
            }
        }

        System.out.println("Number of Words = " + words);
    }
}