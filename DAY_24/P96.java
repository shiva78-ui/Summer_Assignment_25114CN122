import java.util.Scanner;

public class P96 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int freq[] = new int[256];

        // INTITIALLY THE STRING IS EMPTY
        String result = "";

        // Remove duplicate characters
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            // THIS CONDITON TELL THAT THE CHARACTER APPERS FOR THE FIRST TIME , IF THE
            // FREQUENCY IS MORE THAN 1 WE DON'T PRINT IT
            if (freq[ch] == 0) {
                result = result + ch;
                freq[ch]++;
            }
        }

        System.out.println("String after removing duplicates: " + result);

        sc.close();
    }
}