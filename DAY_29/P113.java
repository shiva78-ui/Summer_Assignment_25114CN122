import java.util.*;

public class P113 {

  static Scanner sc = new Scanner(System.in);

  static void addition() {
    System.out.print("Enter First Number: ");
    double a = sc.nextDouble();

    System.out.print("Enter Second Number: ");
    double b = sc.nextDouble();

    System.out.println("The Sum is: " + (a + b));
  }

  static void subtraction() {
    System.out.print("Enter First Number: ");
    double a = sc.nextDouble();

    System.out.print("Enter Second Number: ");
    double b = sc.nextDouble();

    System.out.println("The Subraction is: " + (a - b));
  }

  static void multiplication() {
    System.out.print("Enter First Number: ");
    double a = sc.nextDouble();

    System.out.print("Enter Second Number: ");
    double b = sc.nextDouble();

    System.out.println("The Multiplication is: " + (a * b));
  }

  static void division() {
    System.out.print("Enter First Number: ");
    double a = sc.nextDouble();

    System.out.print("Enter Second Number: ");
    double b = sc.nextDouble();

    if (b == 0) {
      System.out.println("Division by zero is not possible.");
    } else {
      System.out.println("The Quotient is: " + (a / b));
    }
  }

  public static void main(String[] args) {
    while (true) {
      System.out.println("\n1. Addition");
      System.out.println("2. Subtraction");
      System.out.println("3. Multiplication");
      System.out.println("4. Division");
      System.out.println("5. Exit");

      System.out.print("Enter Your Choice: ");
      int choice = sc.nextInt();

      switch (choice) {
        case 1:
          addition();
          break;
        case 2:
          subtraction();
          break;
        case 3:
          multiplication();
          break;
        case 4:
          division();
          break;
        case 5:
          System.out.println("Exiting the program.");
          sc.close();
          return;
        default:
          System.out.println("Invalid Choice.");
      }
    }
  }
}