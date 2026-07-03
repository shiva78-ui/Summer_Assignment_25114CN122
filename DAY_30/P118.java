import java.util.*;

public class P118 {
    public static int addBook(int[] bookId, String[] bookName, String[] author,
            double[] price, boolean[] issued,
            int count, Scanner sc) {

        if (count < bookId.length) {

            System.out.println("\n------- Add Book -------");

            System.out.print("Enter Book ID: ");
            bookId[count] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Book Name: ");
            bookName[count] = sc.nextLine();

            System.out.print("Enter Author Name: ");
            author[count] = sc.nextLine();

            System.out.print("Enter Book Price: ");
            price[count] = sc.nextDouble();

            System.out.print("Is Book Issued (true/false): ");
            issued[count] = sc.nextBoolean();

            count++;

            System.out.println("Book Added Successfully!");

        } else {

            System.out.println("Library is Full!");

        }

        return count;
    }

    public static void displayBooks(int[] bookId, String[] bookName,
            String[] author, double[] price,
            boolean[] issued, int count) {

        System.out.println("\n------- Display All Books -------");

        if (count == 0) {
            System.out.println("No Books Found!");
            return;
        }

        for (int i = 0; i < count; i++) {

            System.out.println("----------------------------");
            System.out.println("Book ID      : " + bookId[i]);
            System.out.println("Book Name    : " + bookName[i]);
            System.out.println("Author       : " + author[i]);
            System.out.println("Price        : " + price[i]);
            System.out.println("Issued       : " + issued[i]);
            System.out.println("----------------------------");
        }
    }

    public static void searchBook(int[] bookId, String[] bookName,
            String[] author, double[] price,
            boolean[] issued, int count,
            Scanner sc) {

        System.out.println("\n------- Search Book -------");

        if (count == 0) {
            System.out.println("No Books Found!");
            return;
        }

        System.out.print("Enter Book ID: ");
        int searchId = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (bookId[i] == searchId) {

                System.out.println("----------------------------");
                System.out.println("Book ID      : " + bookId[i]);
                System.out.println("Book Name    : " + bookName[i]);
                System.out.println("Author       : " + author[i]);
                System.out.println("Price        : " + price[i]);
                System.out.println("Issued       : " + issued[i]);
                System.out.println("----------------------------");

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book Not Found!");
        }
    }

    public static void updateBook(int[] bookId, String[] bookName,
            String[] author, double[] price,
            boolean[] issued, int count,
            Scanner sc) {

        System.out.println("\n------- Update Book -------");

        if (count == 0) {
            System.out.println("No Books Found!");
            return;
        }

        System.out.print("Enter Book ID: ");
        int updateId = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (bookId[i] == updateId) {

                sc.nextLine();

                System.out.print("Enter New Book Name: ");
                bookName[i] = sc.nextLine();

                System.out.print("Enter New Author Name: ");
                author[i] = sc.nextLine();

                System.out.print("Enter New Price: ");
                price[i] = sc.nextDouble();

                System.out.print("Is Book Issued (true/false): ");
                issued[i] = sc.nextBoolean();

                System.out.println("Book Updated Successfully!");

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book Not Found!");
        }
    }

    public static int deleteBook(int[] bookId, String[] bookName,
            String[] author, double[] price,
            boolean[] issued, int count,
            Scanner sc) {

        System.out.println("\n------- Delete Book -------");

        if (count == 0) {
            System.out.println("No Books Found!");
            return count;
        }

        System.out.print("Enter Book ID: ");
        int deleteId = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (bookId[i] == deleteId) {

                for (int j = i; j < count - 1; j++) {

                    bookId[j] = bookId[j + 1];
                    bookName[j] = bookName[j + 1];
                    author[j] = author[j + 1];
                    price[j] = price[j + 1];
                    issued[j] = issued[j + 1];
                }

                count--;

                System.out.println("Book Deleted Successfully!");

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book Not Found!");
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Enter Maximum Number of Books
        System.out.print("Enter the maximum number of books: ");
        int size = sc.nextInt();

        // Arrays
        int[] bookId = new int[size];
        String[] bookName = new String[size];
        String[] author = new String[size];
        double[] price = new double[size];
        boolean[] issued = new boolean[size];

        // Count Variable
        int count = 0;

        while (true) {

            System.out.println("\n========== MINI LIBRARY MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    count = addBook(bookId, bookName, author, price, issued, count, sc);
                    break;

                case 2:
                    displayBooks(bookId, bookName, author, price, issued, count);
                    break;

                case 3:
                    searchBook(bookId, bookName, author, price, issued, count, sc);
                    break;

                case 4:
                    updateBook(bookId, bookName, author, price, issued, count, sc);
                    break;

                case 5:
                    count = deleteBook(bookId, bookName, author, price, issued, count, sc);
                    break;

                case 6:
                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}