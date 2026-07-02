import java.util.*;

public class P109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of books:");
        int n = sc.nextInt();
        int[] bookId = new int[n];
        String[] bookName = new String[n];
        String[] authorName = new String[n];
        String[] category = new String[n];
        int[] quantity = new int[n];

        int count = 0;
        while (true) {
            System.out.println("========= Library Management System =========\r\n" + //
                    "\r\n" + //
                    "1. Add Book\r\n" + //
                    "2. View All Books\r\n" + //
                    "3. Search Book\r\n" + //
                    "4. Update Book\r\n" + //
                    "5. Delete Book\r\n" + //
                    "6. Exit\r\n" + //
                    "\r\n" + //
                    "Enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {

                case 1:

                    if (count < n) {

                        System.out.println("------- Add Book -------");

                        System.out.print("Enter Book ID: ");
                        bookId[count] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Book Name: ");
                        bookName[count] = sc.nextLine();

                        System.out.print("Enter Author Name: ");
                        authorName[count] = sc.nextLine();

                        System.out.print("Enter Book Category: ");
                        category[count] = sc.nextLine();

                        System.out.print("Enter Quantity: ");
                        quantity[count] = sc.nextInt();

                        count++;

                        System.out.println("Book Added Successfully!");

                    } else {

                        System.out.println("Library is Full!");

                    }

                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("No Book Records Found!");
                        break;
                    }
                    System.out.println("------- View All Books -------");
                    for (int i = 0; i < count; i++) {
                        System.out.println("Book ID: " + bookId[i]);
                        System.out.println("Book Name: " + bookName[i]);
                        System.out.println("Author Name: " + authorName[i]);
                        System.out.println("Category: " + category[i]);
                        System.out.println("Quantity: " + quantity[i]);
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("------- Search Book -------");
                    if (count == 0) {
                        System.out.println("No Book Records Found!");
                        break;
                    }
                    System.out.print("Enter Book ID to Search: ");
                    int searchBookId = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (bookId[i] == searchBookId) {
                            System.out.println("Book ID: " + bookId[i]);
                            System.out.println("Book Name: " + bookName[i]);
                            System.out.println("Author Name: " + authorName[i]);
                            System.out.println("Category: " + category[i]);
                            System.out.println("Quantity: " + quantity[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Book not found!");
                    }
                    break;
                case 4:

                    System.out.println("------- Update Book -------");

                    if (count == 0) {
                        System.out.println("No Books Available!");
                        break;
                    }

                    System.out.print("Enter Book ID: ");
                    int updateBookId = sc.nextInt();

                    boolean found1 = false;

                    for (int i = 0; i < count; i++) {

                        if (updateBookId == bookId[i]) {

                            sc.nextLine(); // Consume the newline

                            System.out.print("Enter New Book Name: ");
                            bookName[i] = sc.nextLine();

                            System.out.print("Enter New Author Name: ");
                            authorName[i] = sc.nextLine();

                            System.out.print("Enter New Category: ");
                            category[i] = sc.nextLine();

                            System.out.print("Enter New Quantity: ");
                            quantity[i] = sc.nextInt();

                            System.out.println("Book Record Updated Successfully!");

                            found1 = true;
                            break;
                        }
                    }

                    if (!found1) {
                        System.out.println("Book Not Found!");
                    }

                    break;
                case 5:

                    System.out.println("------- Delete Book -------");

                    if (count == 0) {
                        System.out.println("No Books Available!");
                        break;
                    }

                    System.out.print("Enter Book ID: ");
                    int deleteBookId = sc.nextInt();

                    boolean found2 = false;

                    for (int i = 0; i < count; i++) {

                        if (deleteBookId == bookId[i]) {

                            // Shift all records one position to the left
                            for (int j = i; j < count - 1; j++) {

                                bookId[j] = bookId[j + 1];
                                bookName[j] = bookName[j + 1];
                                authorName[j] = authorName[j + 1];
                                category[j] = category[j + 1];
                                quantity[j] = quantity[j + 1];
                            }

                            count--;

                            System.out.println("Book Deleted Successfully!");

                            found2 = true;
                            break;
                        }
                    }

                    if (!found2) {
                        System.out.println("Book Not Found!");
                    }

                    break;
                case 6:
                    System.out.println("Exiting the program...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
