import java.util.*;

public class P110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of bank users: ");
        int n = sc.nextInt();
        int[] accountNo = new int[n];
        String[] accountHolderName = new String[n];
        String[] accountType = new String[n];
        double[] balance = new double[n];

        int count = 0;
        while (true) {
            System.out.println("========= Bank Management System =========\r\n" + //
                    "\r\n" + //
                    "1. Create Account\r\n" + //
                    "2. View All Accounts\r\n" + //
                    "3. Search Account\r\n" + //
                    "4. Update Account\r\n" + //
                    "5. Delete Account\r\n" + //
                    "6. Deposit Money\r\n" + //
                    "7. Withdraw Money\r\n" + //
                    "8. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:

                    if (count < n) {

                        System.out.println("------- Create Account -------");

                        System.out.print("Enter Account Number: ");
                        accountNo[count] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Account Holder Name: ");
                        accountHolderName[count] = sc.nextLine();

                        System.out.print("Enter Account Type (Saving/Current): ");
                        accountType[count] = sc.nextLine();

                        System.out.print("Enter Initial Balance: ");
                        balance[count] = sc.nextDouble();

                        count++;

                        System.out.println("Account Created Successfully!");

                    } else {

                        System.out.println("Bank Account Limit Reached!");

                    }

                    break;
                case 2:

                    System.out.println("------- View All Accounts -------");

                    if (count == 0) {
                        System.out.println("No Accounts Found!");
                        break;
                    }

                    for (int i = 0; i < count; i++) {

                        System.out.println("-----------------------------------");
                        System.out.println("Account Number      : " + accountNo[i]);
                        System.out.println("Account Holder Name : " + accountHolderName[i]);
                        System.out.println("Account Type        : " + accountType[i]);
                        System.out.println("Current Balance     : ₹" + balance[i]);
                        System.out.println("-----------------------------------");
                    }

                    break;
                case 3:

                    System.out.println("------- Search Account -------");

                    if (count == 0) {
                        System.out.println("No Accounts Found!");
                        break;
                    }

                    System.out.print("Enter Account Number: ");
                    int searchAccountNo = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (searchAccountNo == accountNo[i]) {

                            System.out.println("\nAccount Found!");
                            System.out.println("-----------------------------------");
                            System.out.println("Account Number      : " + accountNo[i]);
                            System.out.println("Account Holder Name : " + accountHolderName[i]);
                            System.out.println("Account Type        : " + accountType[i]);
                            System.out.println("Current Balance     : ₹" + balance[i]);
                            System.out.println("-----------------------------------");

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Account Not Found!");
                    }

                    break;
                case 4:

                    System.out.println("------- Update Account -------");

                    if (count == 0) {
                        System.out.println("No Accounts Found!");
                        break;
                    }

                    System.out.print("Enter Account Number: ");
                    int updateAccountNo = sc.nextInt();

                    boolean found1 = false;

                    for (int i = 0; i < count; i++) {

                        if (updateAccountNo == accountNo[i]) {

                            sc.nextLine();

                            System.out.print("Enter New Account Holder Name: ");
                            accountHolderName[i] = sc.nextLine();

                            System.out.print("Enter New Account Type (Saving/Current): ");
                            accountType[i] = sc.nextLine();

                            System.out.println("Account Updated Successfully!");

                            found1 = true;
                            break;
                        }
                    }

                    if (!found1) {
                        System.out.println("Account Not Found!");
                    }

                    break;
                case 5:

                    System.out.println("------- Delete Account -------");

                    if (count == 0) {
                        System.out.println("No Accounts Found!");
                        break;
                    }

                    System.out.print("Enter Account Number: ");
                    int deleteAccountNo = sc.nextInt();

                    boolean found2 = false;

                    for (int i = 0; i < count; i++) {

                        if (deleteAccountNo == accountNo[i]) {

                            // Shift all records one position to the left
                            for (int j = i; j < count - 1; j++) {

                                accountNo[j] = accountNo[j + 1];
                                accountHolderName[j] = accountHolderName[j + 1];
                                accountType[j] = accountType[j + 1];
                                balance[j] = balance[j + 1];
                            }

                            count--;

                            System.out.println("Account Deleted Successfully!");

                            found2 = true;
                            break;
                        }
                    }

                    if (!found2) {
                        System.out.println("Account Not Found!");
                    }

                    break;
                case 6:

                    System.out.println("------- Deposit Money -------");

                    if (count == 0) {
                        System.out.println("No Accounts Found!");
                        break;
                    }

                    System.out.print("Enter Account Number: ");
                    int depositAccountNo = sc.nextInt();

                    boolean found3 = false;

                    for (int i = 0; i < count; i++) {

                        if (depositAccountNo == accountNo[i]) {

                            System.out.print("Enter Deposit Amount: ");
                            double deposit = sc.nextDouble();

                            balance[i] += deposit;

                            System.out.println("Amount Deposited Successfully!");
                            System.out.println("Current Balance: ₹" + balance[i]);

                            found3 = true;
                            break;
                        }
                    }

                    if (!found3) {
                        System.out.println("Account Not Found!");
                    }

                    break;
                case 7:

                    System.out.println("------- Withdraw Money -------");

                    if (count == 0) {
                        System.out.println("No Accounts Found!");
                        break;
                    }

                    System.out.print("Enter Account Number: ");
                    int withdrawAccountNo = sc.nextInt();

                    boolean found4 = false;

                    for (int i = 0; i < count; i++) {

                        if (withdrawAccountNo == accountNo[i]) {

                            System.out.print("Enter Withdraw Amount: ");
                            double withdraw = sc.nextDouble();

                            if (withdraw <= balance[i]) {

                                balance[i] -= withdraw;

                                System.out.println("Withdrawal Successful!");
                                System.out.println("Current Balance: ₹" + balance[i]);

                            } else {

                                System.out.println("Insufficient Balance!");

                            }

                            found4 = true;
                            break;
                        }
                    }

                    if (!found4) {
                        System.out.println("Account Not Found!");
                    }
                case 8:
                    System.out.println("Exiting the program. Thanks for using our services!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice! Please try again.");
                    break;
            }

        }
    }
}
