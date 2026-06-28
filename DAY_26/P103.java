import java.util.*;

public class P103 {
    public static void main(String[] args) {
        int PIN = 700756;
        int balance = 5000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your PIN: ");
        int n = sc.nextInt();
        if (n == PIN) {
            System.out.println("You can proceed further: ");
            while (true) {
                System.out.println("Please select your choice: ");
                System.out.println("========= ATM MENU =========\r\n" + //
                        "1. Check Balance\r\n" + //
                        "2. Deposit Money\r\n" + //
                        "3. Withdraw Money\r\n" + //
                        "4. Exit\r\n" + //
                        "Enter your choice:");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Current balance: " + balance);
                        break;

                    case 2:
                        System.out.println("Enter the deposit amount: ");
                        int deposit = sc.nextInt();
                        if (deposit > 0) {
                            balance += deposit;
                            System.out.println("Deposit Successful!");
                            System.out.println("Your current balance: " + balance);
                        } else {
                            System.out.println("Invalid deposit amount!");
                        }
                        break;
                    case 3:
                        System.out.println("Enter the withdraw amount: ");
                        int withdraw = sc.nextInt();
                        if (withdraw <= balance) {
                            balance = balance - withdraw;
                            System.out.println("Withdraw succesfull!");
                            System.out.println("Your currnet balance: " + balance);
                        } else {
                            System.out.println("Insufficent Balance");
                        }
                        break;
                    case 4:
                        System.out.println("Thanks for choosing us!");
                        sc.close();
                        return; // we have used the return because it dirctly ends the program and break only
                                // exits the loop
                    default:
                        System.out.println("Invalid choice, try again!!");

                }
            }
        } else {
            System.out.println("Invalid PIN! Try again.");
        }

        sc.close();

    }
}