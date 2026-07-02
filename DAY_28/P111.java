import java.util.*;

class Movie {

    int movieId;
    String movieName;
    String timing;
    int totalSeats;
    int availableSeats;
}

class Booking {

    int bookingId;
    String customerName;
    int movieId;
    int seatsBooked;
}

public class P111 {

    static Scanner sc = new Scanner(System.in);

    static Movie movies[] = new Movie[20];
    static Booking bookings[] = new Booking[100];

    static int movieCount = 0;
    static int bookingCount = 0;

    // Methods
    static void addMovie() {
        if (movieCount == movies.length) {
            System.out.println("Movie list is full!");
            return;
        }

        // Create a new Movie object
        movies[movieCount] = new Movie();

        System.out.print("Enter Movie ID: ");
        movies[movieCount].movieId = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        System.out.print("Enter Movie Name: ");
        movies[movieCount].movieName = sc.nextLine();

        System.out.print("Enter Movie Timing: ");
        movies[movieCount].timing = sc.nextLine();

        System.out.print("Enter Total Seats: ");
        movies[movieCount].totalSeats = sc.nextInt();

        // Initially all seats are available
        // Note this line is important to set the availableSeats equal to totalSeats
        // when a new movie is added
        movies[movieCount].availableSeats = movies[movieCount].totalSeats;

        // Move to the next position in the array
        movieCount++;

        System.out.println("\nMovie Added Successfully!");

    }

    static void displayMovies() {
        if (movieCount == 0) {
            System.out.println("No Movies Available.");
            return;
        }

        System.out.println("\n===== MOVIE LIST =====");

        for (int i = 0; i < movieCount; i++) {

            System.out.println("Movie ID        : " + movies[i].movieId);
            System.out.println("Movie Name      : " + movies[i].movieName);
            System.out.println("Movie Timing    : " + movies[i].timing);
            System.out.println("Total Seats     : " + movies[i].totalSeats);
            System.out.println("Available Seats : " + movies[i].availableSeats);
            System.out.println("--------------------------------------");
        }
    }

    static void bookTicket() {
        if (movieCount == 0) {
            System.out.println("No Movies Available.");
            return;
        }

        System.out.print("Enter Customer Name: ");
        sc.nextLine(); // Remove leftover newline
        String name = sc.nextLine();

        System.out.print("Enter Movie ID: ");
        int id = sc.nextInt();

        int index = -1; // we have initilzed index -1 bcz this condition is false initially and if the
                        // movie is not found then it will remain -1 and we can use this to check if the
                        // movie is found or not

        // Search movie
        for (int i = 0; i < movieCount; i++) {
            if (movies[i].movieId == id) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Movie Not Found.");
            return;
        }

        System.out.print("Enter Number of Seats: ");
        int seats = sc.nextInt();
        // This line is very important bcz if the user enters more seats than available
        // then we need to check that and if the seats are available then we can book
        // the ticket otherwise we will show the message "Seats Not Available."
        if (seats <= movies[index].availableSeats) {

            bookings[bookingCount] = new Booking();

            bookings[bookingCount].bookingId = bookingCount + 1; // If we will not do +1 then the booking id will start
                                                                 // from 0 and it will be confusing for the user
            bookings[bookingCount].customerName = name;
            bookings[bookingCount].movieId = id;
            bookings[bookingCount].seatsBooked = seats;

            movies[index].availableSeats -= seats;

            bookingCount++;

            System.out.println("Ticket Booked Successfully.");
            System.out.println("Booking ID: " + bookingCount);

        } else {

            System.out.println("Seats Not Available.");

        }
    }

    static void cancelTicket() {

        if (bookingCount == 0) {
            System.out.println("No Bookings Available.");
            return;
        }

        System.out.print("Enter Booking ID: ");
        int id = sc.nextInt();

        int bookingIndex = -1;

        // Search Booking
        for (int i = 0; i < bookingCount; i++) {
            if (bookings[i].bookingId == id) {
                bookingIndex = i;
                break;
            }
        }

        if (bookingIndex == -1) {
            System.out.println("Booking Not Found.");
            return;
        }

        // Increase Available Seats
        for (int i = 0; i < movieCount; i++) {

            if (movies[i].movieId == bookings[bookingIndex].movieId) {

                movies[i].availableSeats = movies[i].availableSeats + bookings[bookingIndex].seatsBooked;

                break;
            }
        }

        // Shift bookings to the left
        for (int i = bookingIndex; i < bookingCount - 1; i++) {

            bookings[i] = bookings[i + 1];

        }

        bookings[bookingCount - 1] = null;

        bookingCount--;

        System.out.println("Ticket Cancelled Successfully.");
    }

    static void viewBookings() {

        if (bookingCount == 0) {
            System.out.println("No Bookings Available.");
            return;
        }

        System.out.println("\n========== BOOKING DETAILS ==========");

        for (int i = 0; i < bookingCount; i++) {

            String movieName = "";

            for (int j = 0; j < movieCount; j++) {

                if (movies[j].movieId == bookings[i].movieId) {
                    movieName = movies[j].movieName;
                    break;
                }
            }

            System.out.println("Booking ID    : " + bookings[i].bookingId);
            System.out.println("Customer Name : " + bookings[i].customerName);
            System.out.println("Movie Name    : " + movieName);
            System.out.println("Seats Booked  : " + bookings[i].seatsBooked);

            System.out.println("-------------------------------------");
        }
    }

    static void searchBooking() {
        if (bookingCount == 0) {
            System.out.println("No Bookings Available.");
            return;
        }

        System.out.print("Enter Booking ID: ");
        int id = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < bookingCount; i++) {

            if (bookings[i].bookingId == id) {

                String movieName = "";

                // Find Movie Name
                for (int j = 0; j < movieCount; j++) {

                    if (movies[j].movieId == bookings[i].movieId) {

                        movieName = movies[j].movieName;
                        break;
                    }
                }

                System.out.println("\n===== BOOKING FOUND =====");
                System.out.println("Booking ID    : " + bookings[i].bookingId);
                System.out.println("Customer Name : " + bookings[i].customerName);
                System.out.println("Movie Name    : " + movieName);
                System.out.println("Seats Booked  : " + bookings[i].seatsBooked);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Booking Not Found.");
        }
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n========== MOVIE TICKET BOOKING SYSTEM ==========");
            System.out.println("1. Add Movie");
            System.out.println("2. Display Movies");
            System.out.println("3. Book Ticket");
            System.out.println("4. Cancel Ticket");
            System.out.println("5. View Bookings");
            System.out.println("6. Search Booking");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addMovie();
                    break;

                case 2:
                    displayMovies();
                    break;

                case 3:
                    bookTicket();
                    break;

                case 4:
                    cancelTicket();
                    break;

                case 5:
                    viewBookings();
                    break;

                case 6:
                    searchBooking();
                    break;

                case 7:
                    System.out.println("Thank You! Visit Again.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 7);
        sc.close();
    }
}