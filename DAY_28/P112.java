import java.util.*;

class Contact {

    int contactId;
    String name;
    String mobileNumber;
    String email;
    String address;
}

public class P112 {
    // First we have declared the array
    static Contact contacts[];
    static int contactCount = 0;
    static Scanner sc = new Scanner(System.in);

    static void addContact() {

        if (contactCount == contacts.length) {
            System.out.println("Contact List is Full.");
            return;
        }

        contacts[contactCount] = new Contact();

        System.out.print("Enter Contact ID: ");
        contacts[contactCount].contactId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        contacts[contactCount].name = sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        contacts[contactCount].mobileNumber = sc.nextLine();

        System.out.print("Enter Email: ");
        contacts[contactCount].email = sc.nextLine();

        System.out.print("Enter Address: ");
        contacts[contactCount].address = sc.nextLine();

        contactCount++;

        System.out.println("Contact Added Successfully.");
    }

    static void displayContacts() {

        if (contactCount == 0) {
            System.out.println("No Contacts Available.");
            return;
        }

        for (int i = 0; i < contactCount; i++) {

            System.out.println("\nContact " + (i + 1));
            System.out.println("Contact ID : " + contacts[i].contactId);
            System.out.println("Name       : " + contacts[i].name);
            System.out.println("Mobile No. : " + contacts[i].mobileNumber);
            System.out.println("Email      : " + contacts[i].email);
            System.out.println("Address    : " + contacts[i].address);
            System.out.println("----------------------------------");
        }
    }

    static void searchContact() {

        if (contactCount == 0) {
            System.out.println("No Contacts Available.");
            return;
        }

        System.out.print("Enter Contact ID: ");
        int id = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < contactCount; i++) {

            if (contacts[i].contactId == id) {

                System.out.println("\nContact Found");
                System.out.println("Contact ID : " + contacts[i].contactId);
                System.out.println("Name       : " + contacts[i].name);
                System.out.println("Mobile No. : " + contacts[i].mobileNumber);
                System.out.println("Email      : " + contacts[i].email);
                System.out.println("Address    : " + contacts[i].address);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact Not Found.");
        }
    }

    static void updateContact() {

        if (contactCount == 0) {
            System.out.println("No Contacts Available.");
            return;
        }

        System.out.print("Enter Contact ID to Update: ");
        int id = sc.nextInt();
        sc.nextLine();

        int index = -1;

        for (int i = 0; i < contactCount; i++) {

            if (contacts[i].contactId == id) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Contact Not Found.");
            return;
        }

        System.out.print("Enter New Name: ");
        contacts[index].name = sc.nextLine();

        System.out.print("Enter New Mobile Number: ");
        contacts[index].mobileNumber = sc.nextLine();

        System.out.print("Enter New Email: ");
        contacts[index].email = sc.nextLine();

        System.out.print("Enter New Address: ");
        contacts[index].address = sc.nextLine();

        System.out.println("Contact Updated Successfully.");
    }

    static void deleteContact() {

        if (contactCount == 0) {
            System.out.println("No Contacts Available.");
            return;
        }

        System.out.print("Enter Contact ID to Delete: ");
        int id = sc.nextInt();

        int index = -1;

        for (int i = 0; i < contactCount; i++) {

            if (contacts[i].contactId == id) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Contact Not Found.");
            return;
        }

        for (int i = index; i < contactCount - 1; i++) {

            contacts[i] = contacts[i + 1];

        }

        contacts[contactCount - 1] = null;

        contactCount--;

        System.out.println("Contact Deleted Successfully.");
    }

    static void sortContacts() {

        if (contactCount == 0) {
            System.out.println("No Contacts Available.");
            return;
        }

        for (int i = 0; i < contactCount - 1; i++) {

            for (int j = 0; j < contactCount - i - 1; j++) {

                if (contacts[j].name.compareToIgnoreCase(contacts[j + 1].name) > 0) {

                    Contact temp = contacts[j];
                    contacts[j] = contacts[j + 1];
                    contacts[j + 1] = temp;
                }
            }
        }

        System.out.println("Contacts Sorted Successfully.");
    }

    public static void main(String[] args) {
        // Taking the input from the user for the number of contact that can be added
        System.out.print("Enter the maximum number of contacts: ");
        int n = sc.nextInt();

        contacts = new Contact[n];
        while (true) {

            System.out.println("1. Add Contact");
            System.out.println("2. Display Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Sort Contact");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addContact();
                    break;

                case 2:
                    displayContacts();
                    break;

                case 3:
                    searchContact();
                    break;

                case 4:
                    updateContact();
                    break;

                case 5:
                    deleteContact();
                    break;

                case 6:
                    sortContacts();
                    break;

                case 7:
                    System.out.println("Thank You!");
                    sc.close();
                    return; // 

                default:
                    System.out.println("Invalid Choice.");
            }
        }

    }
}