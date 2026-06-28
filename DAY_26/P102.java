import java.util.*;

public class P102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter Your age: ");
        int age = sc.nextInt();
        if (age < 0) {
            System.out.println("Invalid input, try again");
        } else if (age >= 18) {
            System.out.println("You are eligible for voting!");
        } else {
            System.out.println("You are not eligible for voting");
        }
        sc.close();

    }
}