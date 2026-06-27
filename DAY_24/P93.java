import java.util.Scanner;

public class P93 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Check lengths
        if (str1.length() != str2.length()) {
            System.out.println("Strings are not rotations.");
            return;
        }

        // Concatenate first string with itself
        String temp = str1 + str1;

        // Check if second string is present
        // contain method is used to check weather the following substring is present or not in the string
        if (temp.contains(str2)) {
            System.out.println("Strings are rotations.");
        } else {
            System.out.println("Strings are not rotations.");
        }

        sc.close();
    }
}