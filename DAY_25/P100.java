import java.util.Scanner;

public class P100 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        // Split sentence into words
        String words[] = str.split(" ");

        // Bubble Sort based on word length
        for (int i = 0; i < words.length - 1; i++) {

            for (int j = 0; j < words.length - i - 1; j++) {
                // THIS IS THE MAIN CONDITION
                if (words[j].length() > words[j + 1].length()
                        || (words[j].length() == words[j + 1].length()
                                && words[j].compareTo(words[j + 1]) > 0)) {

                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        // Display sorted words
        System.out.println("Words sorted by length:");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        sc.close();
    }
}
