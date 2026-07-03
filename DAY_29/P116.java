import java.util.*;

class Bus {
    String busNumber;
    String busName;
    String busType;

    String source;
    String destination;

    String journeyDate;
    String departureTime;
    String arrivalTime;
    String journeyDuration;

    double distance;
    double fare;

    int totalSeats;
    int availableSeats;

    String driverName;
    String driverPhone;

    String status;

    String runningDays[];
    String stops[];
    String stopTimings[];
}

class Ticket {
    int ticketId;
    String passengerName;
    int age;
    String gender;
    String mobileNumber;

    String busNumber;
    String source;
    String destination;

    String journeyDate;

    int seatNumber;

    double fare;

    String paymentMode;
    String bookingStatus;
}

public class P116 {
    static Scanner sc = new Scanner(System.in);

    static Bus buses[];

    static int count = 0;
    static Ticket tickets[];
    static int ticketCount = 0;

    public static void busManagement() {
        System.out.println("\n==================================================");
        System.out.println("                BUS MANAGEMENT");
        System.out.println("==================================================");
        System.out.println("1. Add New Bus");
        System.out.println("2. Display All Buses");
        System.out.println("3. Search Bus by Bus Number");
        System.out.println("4. Update Bus Information");
        System.out.println("5. Delete Bus");
        System.out.println("6. Back to Main Menu");
        System.out.println("==================================================");
        System.out.print("Enter Your Choice : ");
    }

    {
        System.out.println("\n==================================================");
        System.out.println("                BUS MANAGEMENT");
        System.out.println("==================================================");
        System.out.println("1. Add New Bus");
        System.out.println("2. Display All Buses");
        System.out.println("3. Search Bus by Bus Number");
        System.out.println("4. Update Bus Information");
        System.out.println("5. Delete Bus");
        System.out.println("6. Back to Main Menu");
        System.out.println("==================================================");
        System.out.print("Enter Your Choice : ");
    }

    public static void addBus() {
        if (count == buses.length) {
            System.out.println("\nBus Storage is Full!");
            return;
        }

        buses[count] = new Bus();

        System.out.println("\n===========================================");
        System.out.println("              ADD NEW BUS");
        System.out.println("===========================================");

        System.out.print("Enter Bus Number : ");
        buses[count].busNumber = sc.next();

        sc.nextLine();

        System.out.print("Enter Bus Name : ");
        buses[count].busName = sc.nextLine();

        System.out.print("Enter Bus Type : ");
        buses[count].busType = sc.nextLine();

        System.out.print("Enter Source : ");
        buses[count].source = sc.nextLine();

        System.out.print("Enter Destination : ");
        buses[count].destination = sc.nextLine();

        System.out.print("Enter Journey Date : ");
        buses[count].journeyDate = sc.nextLine();

        System.out.print("Enter Departure Time : ");
        buses[count].departureTime = sc.nextLine();

        System.out.print("Enter Arrival Time : ");
        buses[count].arrivalTime = sc.nextLine();

        System.out.print("Enter Journey Duration : ");
        buses[count].journeyDuration = sc.nextLine();

        System.out.print("Enter Distance (KM) : ");
        buses[count].distance = sc.nextDouble();

        System.out.print("Enter Fare : ");
        buses[count].fare = sc.nextDouble();

        System.out.print("Enter Total Seats : ");
        buses[count].totalSeats = sc.nextInt();

        buses[count].availableSeats = buses[count].totalSeats;

        sc.nextLine();

        System.out.print("Enter Driver Name : ");
        buses[count].driverName = sc.nextLine();

        System.out.print("Enter Driver Contact : ");
        buses[count].driverPhone = sc.nextLine();

        System.out.print("Enter Bus Status : ");
        buses[count].status = sc.nextLine();

        System.out.print("Enter Number of Running Days : ");
        int days = sc.nextInt();

        sc.nextLine();

        buses[count].runningDays = new String[days];

        for (int i = 0; i < days; i++) {
            System.out.print("Running Day " + (i + 1) + " : ");
            buses[count].runningDays[i] = sc.nextLine();
        }

        System.out.print("Enter Number of Stops : ");
        int stop = sc.nextInt();

        sc.nextLine();

        buses[count].stops = new String[stop];
        buses[count].stopTimings = new String[stop];

        for (int i = 0; i < stop; i++) {
            System.out.print("Enter Stop " + (i + 1) + " : ");
            buses[count].stops[i] = sc.nextLine();

            System.out.print("Enter Stop Timing : ");
            buses[count].stopTimings[i] = sc.nextLine();
        }

        count++;

        System.out.println("\nBus Added Successfully.");
    }

    public static void displayBus() {
        if (count == 0) {
            System.out.println("\nNo Bus Records Found!");
            return;
        }

        System.out.println("\n==============================================================");
        System.out.println("                    BUS DETAILS");
        System.out.println("==============================================================");

        for (int i = 0; i < count; i++) {
            System.out.println("\nBus Record : " + (i + 1));
            System.out.println("--------------------------------------------------------------");

            System.out.println("Bus Number        : " + buses[i].busNumber);
            System.out.println("Bus Name          : " + buses[i].busName);
            System.out.println("Bus Type          : " + buses[i].busType);

            System.out.println("Source            : " + buses[i].source);
            System.out.println("Destination       : " + buses[i].destination);

            System.out.println("Journey Date      : " + buses[i].journeyDate);
            System.out.println("Departure Time    : " + buses[i].departureTime);
            System.out.println("Arrival Time      : " + buses[i].arrivalTime);
            System.out.println("Journey Duration  : " + buses[i].journeyDuration);

            System.out.println("Distance          : " + buses[i].distance + " KM");
            System.out.println("Fare              : ₹" + buses[i].fare);

            System.out.println("Total Seats       : " + buses[i].totalSeats);
            System.out.println("Available Seats   : " + buses[i].availableSeats);

            System.out.println("Driver Name       : " + buses[i].driverName);
            System.out.println("Driver Contact    : " + buses[i].driverPhone);

            System.out.println("Bus Status        : " + buses[i].status);

            System.out.print("Running Days      : ");
            for (int j = 0; j < buses[i].runningDays.length; j++) {
                System.out.print(buses[i].runningDays[j] + " ");
            }

            System.out.println();

            System.out.println("\nStops and Timings");

            for (int j = 0; j < buses[i].stops.length; j++) {
                System.out.println((j + 1) + ". "
                        + buses[i].stops[j]
                        + " --> "
                        + buses[i].stopTimings[j]);
            }

            System.out.println("--------------------------------------------------------------");
        }
    }

    public static void searchBus() {
        if (count == 0) {
            System.out.println("\nNo Bus Records Found!");
            return;
        }

        System.out.print("\nEnter Bus Number to Search : ");
        String busNo = sc.next();

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (buses[i].busNumber.equalsIgnoreCase(busNo)) {
                found = true;

                System.out.println("\n==============================================");
                System.out.println("              BUS FOUND");
                System.out.println("==============================================");

                System.out.println("Bus Number        : " + buses[i].busNumber);
                System.out.println("Bus Name          : " + buses[i].busName);
                System.out.println("Bus Type          : " + buses[i].busType);

                System.out.println("Source            : " + buses[i].source);
                System.out.println("Destination       : " + buses[i].destination);

                System.out.println("Journey Date      : " + buses[i].journeyDate);
                System.out.println("Departure Time    : " + buses[i].departureTime);
                System.out.println("Arrival Time      : " + buses[i].arrivalTime);
                System.out.println("Journey Duration  : " + buses[i].journeyDuration);

                System.out.println("Distance          : " + buses[i].distance + " KM");
                System.out.println("Fare              : ₹" + buses[i].fare);

                System.out.println("Total Seats       : " + buses[i].totalSeats);
                System.out.println("Available Seats   : " + buses[i].availableSeats);

                System.out.println("Driver Name       : " + buses[i].driverName);
                System.out.println("Driver Contact    : " + buses[i].driverPhone);

                System.out.println("Bus Status        : " + buses[i].status);

                System.out.print("Running Days      : ");
                for (int j = 0; j < buses[i].runningDays.length; j++) {
                    System.out.print(buses[i].runningDays[j] + " ");
                }

                System.out.println();

                System.out.println("\nStops and Timings");

                for (int j = 0; j < buses[i].stops.length; j++) {
                    System.out.println((j + 1) + ". "
                            + buses[i].stops[j]
                            + " --> "
                            + buses[i].stopTimings[j]);
                }

                System.out.println("==============================================");

                break;
            }
        }

        if (!found) {
            System.out.println("\nBus Not Found!");
        }
    }

    public static void updateBus() {
        if (count == 0) {
            System.out.println("\nNo Bus Records Found!");
            return;
        }

        System.out.print("\nEnter Bus Number to Update : ");
        String busNo = sc.next();

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (buses[i].busNumber.equalsIgnoreCase(busNo)) {
                found = true;

                int choice;

                do {
                    System.out.println("\n======================================");
                    System.out.println("          UPDATE BUS");
                    System.out.println("======================================");
                    System.out.println("1. Bus Name");
                    System.out.println("2. Bus Type");
                    System.out.println("3. Source");
                    System.out.println("4. Destination");
                    System.out.println("5. Journey Date");
                    System.out.println("6. Departure Time");
                    System.out.println("7. Arrival Time");
                    System.out.println("8. Journey Duration");
                    System.out.println("9. Distance");
                    System.out.println("10. Fare");
                    System.out.println("11. Total Seats");
                    System.out.println("12. Driver Name");
                    System.out.println("13. Driver Contact");
                    System.out.println("14. Bus Status");
                    System.out.println("15. Exit");
                    System.out.print("Enter Your Choice : ");

                    choice = sc.nextInt();
                    sc.nextLine();

                    switch (choice) {
                        case 1:
                            System.out.print("Enter New Bus Name : ");
                            buses[i].busName = sc.nextLine();
                            break;

                        case 2:
                            System.out.print("Enter New Bus Type : ");
                            buses[i].busType = sc.nextLine();
                            break;

                        case 3:
                            System.out.print("Enter New Source : ");
                            buses[i].source = sc.nextLine();
                            break;

                        case 4:
                            System.out.print("Enter New Destination : ");
                            buses[i].destination = sc.nextLine();
                            break;

                        case 5:
                            System.out.print("Enter New Journey Date : ");
                            buses[i].journeyDate = sc.nextLine();
                            break;

                        case 6:
                            System.out.print("Enter New Departure Time : ");
                            buses[i].departureTime = sc.nextLine();
                            break;

                        case 7:
                            System.out.print("Enter New Arrival Time : ");
                            buses[i].arrivalTime = sc.nextLine();
                            break;

                        case 8:
                            System.out.print("Enter New Journey Duration : ");
                            buses[i].journeyDuration = sc.nextLine();
                            break;

                        case 9:
                            System.out.print("Enter New Distance : ");
                            buses[i].distance = sc.nextDouble();
                            break;

                        case 10:
                            System.out.print("Enter New Fare : ");
                            buses[i].fare = sc.nextDouble();
                            break;

                        case 11:
                            System.out.print("Enter New Total Seats : ");
                            buses[i].totalSeats = sc.nextInt();

                            if (buses[i].availableSeats > buses[i].totalSeats) {
                                buses[i].availableSeats = buses[i].totalSeats;
                            }
                            break;

                        case 12:
                            sc.nextLine();
                            System.out.print("Enter New Driver Name : ");
                            buses[i].driverName = sc.nextLine();
                            break;

                        case 13:
                            System.out.print("Enter New Driver Contact : ");
                            buses[i].driverPhone = sc.nextLine();
                            break;

                        case 14:
                            System.out.print("Enter New Bus Status : ");
                            buses[i].status = sc.nextLine();
                            break;

                        case 15:
                            break;

                        default:
                            System.out.println("Invalid Choice!");
                    }

                } while (choice != 15);

                System.out.println("\nBus Information Updated Successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("\nBus Not Found!");
        }
    }

    public static void deleteBus() {
        if (count == 0) {
            System.out.println("\nNo Bus Records Found!");
            return;
        }

        System.out.print("\nEnter Bus Number to Delete : ");
        String busNo = sc.next();

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (buses[i].busNumber.equalsIgnoreCase(busNo)) {
                found = true;

                for (int j = i; j < count - 1; j++) {
                    buses[j] = buses[j + 1];
                }

                buses[count - 1] = null;
                count--;

                System.out.println("\nBus Deleted Successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("\nBus Not Found!");
        }
    }

    public static void routeManagement() {
        System.out.println("\n==================================================");
        System.out.println("               ROUTE MANAGEMENT");
        System.out.println("==================================================");
        System.out.println("1. Search by Source & Destination");
        System.out.println("2. Display Route");
        System.out.println("3. Journey Schedule");
        System.out.println("4. Running Days");
        System.out.println("5. Display Fare");
        System.out.println("6. Display Distance");
        System.out.println("7. Display Bus Type");
        System.out.println("8. Back");
        System.out.println("==================================================");
        System.out.print("Enter Your Choice : ");
    }

    public static void searchRoute() {
        if (count == 0) {
            System.out.println("\nNo Bus Records Found!");
            return;
        }

        sc.nextLine();

        System.out.print("\nEnter Source : ");
        String source = sc.nextLine();

        System.out.print("Enter Destination : ");
        String destination = sc.nextLine();

        boolean found = false;

        System.out.println("\n============== AVAILABLE BUSES ==============");

        for (int i = 0; i < count; i++) {
            if (buses[i].source.equalsIgnoreCase(source) &&
                    buses[i].destination.equalsIgnoreCase(destination)) {
                found = true;

                System.out.println("-------------------------------------------");
                System.out.println("Bus Number      : " + buses[i].busNumber);
                System.out.println("Bus Name        : " + buses[i].busName);
                System.out.println("Bus Type        : " + buses[i].busType);
                System.out.println("Departure Time  : " + buses[i].departureTime);
                System.out.println("Arrival Time    : " + buses[i].arrivalTime);
                System.out.println("Fare            : ₹" + buses[i].fare);
                System.out.println("Available Seats : " + buses[i].availableSeats);
                System.out.println("-------------------------------------------");
            }
        }

        if (!found) {
            System.out.println("No Bus Found on this Route!");
        }
    }

    public static void displayRoute() {
        if (count == 0) {
            System.out.println("\nNo Bus Records Found!");
            return;
        }

        System.out.print("\nEnter Bus Number : ");
        String busNo = sc.next();

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (buses[i].busNumber.equalsIgnoreCase(busNo)) {
                found = true;

                System.out.println("\n========== ROUTE ==========");
                System.out.println(buses[i].source);

                for (int j = 0; j < buses[i].stops.length; j++) {
                    System.out.println("   ↓");
                    System.out.println(buses[i].stops[j]);
                }

                System.out.println("   ↓");
                System.out.println(buses[i].destination);

                break;
            }
        }

        if (!found) {
            System.out.println("\nBus Not Found!");
        }
    }

    public static void displayJourneySchedule() {
        if (count == 0) {
            System.out.println("\nNo Bus Records Found!");
            return;
        }

        System.out.print("\nEnter Bus Number : ");
        String busNo = sc.next();

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (buses[i].busNumber.equalsIgnoreCase(busNo)) {
                found = true;

                System.out.println("\n========== JOURNEY SCHEDULE ==========");
                System.out.println("Journey Date     : " + buses[i].journeyDate);
                System.out.println("Departure Time   : " + buses[i].departureTime);
                System.out.println("Arrival Time     : " + buses[i].arrivalTime);
                System.out.println("Duration         : " + buses[i].journeyDuration);

                break;
            }
        }

        if (!found) {
            System.out.println("\nBus Not Found!");
        }
    }

    public static void displayRunningDays() {
        if (count == 0) {
            System.out.println("\nNo Bus Records Found!");
            return;
        }

        System.out.print("\nEnter Bus Number : ");
        String busNo = sc.next();

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (buses[i].busNumber.equalsIgnoreCase(busNo)) {
                found = true;

                System.out.println("\nRunning Days");

                for (int j = 0; j < buses[i].runningDays.length; j++) {
                    System.out.println(buses[i].runningDays[j]);
                }

                break;
            }
        }

        if (!found) {
            System.out.println("\nBus Not Found!");
        }
    }

    public static void displayFare() {
        if (count == 0) {
            System.out.println("\nNo Bus Records Found!");
            return;
        }

        System.out.print("\nEnter Bus Number : ");
        String busNo = sc.next();

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (buses[i].busNumber.equalsIgnoreCase(busNo)) {
                found = true;

                System.out.println("\nFare : ₹" + buses[i].fare);

                break;
            }
        }

        if (!found) {
            System.out.println("\nBus Not Found!");
        }
    }

    public static void displayDistance() {
        if (count == 0) {
            System.out.println("\nNo Bus Records Found!");
            return;
        }

        System.out.print("\nEnter Bus Number : ");
        String busNo = sc.next();

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (buses[i].busNumber.equalsIgnoreCase(busNo)) {
                found = true;

                System.out.println("\nDistance : " + buses[i].distance + " KM");

                break;
            }
        }

        if (!found) {
            System.out.println("\nBus Not Found!");
        }
    }

    public static void displayBusType() {
        if (count == 0) {
            System.out.println("\nNo Bus Records Found!");
            return;
        }

        System.out.print("\nEnter Bus Number : ");
        String busNo = sc.next();

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (buses[i].busNumber.equalsIgnoreCase(busNo)) {
                found = true;

                System.out.println("\nBus Type : " + buses[i].busType);

                break;
            }
        }

        if (!found) {
            System.out.println("\nBus Not Found!");
        }
    }

    public static void ticketManagement() {
        System.out.println("\n==================================================");
        System.out.println("              TICKET MANAGEMENT");
        System.out.println("==================================================");
        System.out.println("1. Book Ticket");
        System.out.println("2. Cancel Ticket");
        System.out.println("3. Print Ticket");
        System.out.println("4. Passenger Details");
        System.out.println("5. Seat Availability");
        System.out.println("6. Back");
        System.out.println("==================================================");
        System.out.print("Enter Your Choice : ");
    }

    public static void bookTicket() {
        if (ticketCount == tickets.length) {
            System.out.println("\nTicket Storage Full!");
            return;
        }

        if (count == 0) {
            System.out.println("\nNo Bus Available!");
            return;
        }

        System.out.print("\nEnter Bus Number : ");
        String busNo = sc.next();

        int index = -1;

        for (int i = 0; i < count; i++) {
            if (buses[i].busNumber.equalsIgnoreCase(busNo)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("\nBus Not Found!");
            return;
        }

        if (buses[index].availableSeats == 0) {
            System.out.println("\nNo Seats Available!");
            return;
        }

        tickets[ticketCount] = new Ticket();

        tickets[ticketCount].ticketId = ticketCount + 1;

        sc.nextLine();

        System.out.print("Passenger Name : ");
        tickets[ticketCount].passengerName = sc.nextLine();

        System.out.print("Age : ");
        tickets[ticketCount].age = sc.nextInt();

        sc.nextLine();

        System.out.print("Gender : ");
        tickets[ticketCount].gender = sc.nextLine();

        System.out.print("Mobile Number : ");
        tickets[ticketCount].mobileNumber = sc.nextLine();

        System.out.print("Seat Number : ");
        tickets[ticketCount].seatNumber = sc.nextInt();

        sc.nextLine();

        System.out.print("Payment Mode : ");
        tickets[ticketCount].paymentMode = sc.nextLine();

        tickets[ticketCount].busNumber = buses[index].busNumber;
        tickets[ticketCount].source = buses[index].source;
        tickets[ticketCount].destination = buses[index].destination;
        tickets[ticketCount].journeyDate = buses[index].journeyDate;
        tickets[ticketCount].fare = buses[index].fare;
        tickets[ticketCount].bookingStatus = "CONFIRMED";

        buses[index].availableSeats--;

        System.out.println("\nTicket Booked Successfully.");
        System.out.println("Ticket ID : " + tickets[ticketCount].ticketId);

        ticketCount++;
    }

    public static void cancelTicket() {
        if (ticketCount == 0) {
            System.out.println("\nNo Ticket Found!");
            return;
        }

        System.out.print("\nEnter Ticket ID : ");
        int id = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < ticketCount; i++) {
            if (tickets[i].ticketId == id) {
                found = true;

                for (int j = 0; j < count; j++) {
                    if (buses[j].busNumber.equalsIgnoreCase(tickets[i].busNumber)) {
                        buses[j].availableSeats++;
                        break;
                    }
                }

                for (int j = i; j < ticketCount - 1; j++) {
                    tickets[j] = tickets[j + 1];
                }

                tickets[ticketCount - 1] = null;

                ticketCount--;

                System.out.println("\nTicket Cancelled Successfully!");

                break;
            }
        }

        if (!found) {
            System.out.println("\nTicket Not Found!");
        }
    }

    public static void printTicket() {
        if (ticketCount == 0) {
            System.out.println("\nNo Ticket Found!");
            return;
        }

        System.out.print("\nEnter Ticket ID : ");

        int id = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < ticketCount; i++) {
            if (tickets[i].ticketId == id) {
                found = true;

                System.out.println("\n==============================");
                System.out.println("         BUS TICKET");
                System.out.println("==============================");

                System.out.println("Ticket ID : " + tickets[i].ticketId);
                System.out.println("Passenger : " + tickets[i].passengerName);
                System.out.println("Bus Number : " + tickets[i].busNumber);

                System.out.println("Source : " + tickets[i].source);
                System.out.println("Destination : " + tickets[i].destination);

                System.out.println("Journey Date : " + tickets[i].journeyDate);

                System.out.println("Seat Number : " + tickets[i].seatNumber);

                System.out.println("Fare : ₹" + tickets[i].fare);

                System.out.println("Payment : " + tickets[i].paymentMode);

                System.out.println("Status : " + tickets[i].bookingStatus);

                System.out.println("==============================");

                break;
            }
        }

        if (!found) {
            System.out.println("\nTicket Not Found!");
        }
    }

    public static void passengerDetails() {
        if (ticketCount == 0) {
            System.out.println("\nNo Passenger Record!");
            return;
        }

        System.out.print("\nEnter Ticket ID : ");

        int id = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < ticketCount; i++) {
            if (tickets[i].ticketId == id) {
                found = true;

                System.out.println("\nPassenger Name : " + tickets[i].passengerName);
                System.out.println("Age : " + tickets[i].age);
                System.out.println("Gender : " + tickets[i].gender);
                System.out.println("Mobile : " + tickets[i].mobileNumber);

                break;
            }
        }

        if (!found) {
            System.out.println("\nPassenger Not Found!");
        }
    }

    public static void seatAvailability() {
        if (count == 0) {
            System.out.println("\nNo Bus Available!");
            return;
        }

        System.out.print("\nEnter Bus Number : ");

        String busNo = sc.next();

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (buses[i].busNumber.equalsIgnoreCase(busNo)) {
                found = true;

                System.out.println("\nTotal Seats : " + buses[i].totalSeats);
                System.out.println("Available Seats : " + buses[i].availableSeats);
                System.out.println("Booked Seats : " + (buses[i].totalSeats - buses[i].availableSeats));

                break;
            }
        }

        if (!found) {
            System.out.println("\nBus Not Found!");
        }
    }

    public static void reports() {
        System.out.println("\n==================================================");
        System.out.println("                  REPORTS");
        System.out.println("==================================================");
        System.out.println("1. Driver Details");
        System.out.println("2. Bus Status");
        System.out.println("3. Total Collection");
        System.out.println("4. Total Bookings");
        System.out.println("5. Back");
        System.out.println("==================================================");
        System.out.print("Enter Your Choice : ");
    }

    public static void driverDetails() {
        if (count == 0) {
            System.out.println("\nNo Bus Records Found!");
            return;
        }

        System.out.print("\nEnter Bus Number : ");
        String busNo = sc.next();

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (buses[i].busNumber.equalsIgnoreCase(busNo)) {
                found = true;

                System.out.println("\n========== DRIVER DETAILS ==========");
                System.out.println("Bus Number     : " + buses[i].busNumber);
                System.out.println("Bus Name       : " + buses[i].busName);
                System.out.println("Driver Name    : " + buses[i].driverName);
                System.out.println("Driver Contact : " + buses[i].driverPhone);
                System.out.println("====================================");

                break;
            }
        }

        if (!found) {
            System.out.println("\nBus Not Found!");
        }
    }

    public static void busStatus() {
        if (count == 0) {
            System.out.println("\nNo Bus Records Found!");
            return;
        }

        System.out.println("\n============= BUS STATUS =============");

        for (int i = 0; i < count; i++) {
            System.out.println("--------------------------------------");
            System.out.println("Bus Number : " + buses[i].busNumber);
            System.out.println("Bus Name   : " + buses[i].busName);
            System.out.println("Status     : " + buses[i].status);
        }

        System.out.println("--------------------------------------");
    }

    public static void totalCollection() {
        if (ticketCount == 0) {
            System.out.println("\nNo Ticket Bookings Found!");
            return;
        }

        double total = 0;

        for (int i = 0; i < ticketCount; i++) {
            total = total + tickets[i].fare;
        }

        System.out.println("\n========== TOTAL COLLECTION ==========");
        System.out.println("Total Tickets Booked : " + ticketCount);
        System.out.println("Total Revenue        : ₹" + total);
        System.out.println("======================================");
    }

    public static void totalBookings() {
        if (ticketCount == 0) {
            System.out.println("\nNo Ticket Bookings Found!");
            return;
        }

        System.out.println("\n========== BOOKING REPORT ==========");
        System.out.println("Total Bookings : " + ticketCount);

        for (int i = 0; i < ticketCount; i++) {
            System.out.println("------------------------------------");
            System.out.println("Ticket ID      : " + tickets[i].ticketId);
            System.out.println("Passenger Name : " + tickets[i].passengerName);
            System.out.println("Bus Number     : " + tickets[i].busNumber);
            System.out.println("Seat Number    : " + tickets[i].seatNumber);
            System.out.println("Status         : " + tickets[i].bookingStatus);
        }

        System.out.println("------------------------------------");
    }

    public static void mainMenu() {
        System.out.println("\n============================================================");
        System.out.println("             BUS RESERVATION MANAGEMENT SYSTEM");
        System.out.println("============================================================");
        System.out.println("1. Bus Management");
        System.out.println("2. Route Management");
        System.out.println("3. Ticket Management");
        System.out.println("4. Reports");
        System.out.println("5. Exit");
        System.out.println("============================================================");
    }

    public static void main(String args[]) {
        System.out.println("============================================");
        System.out.println("WELCOME TO BUS RESERVATION MANAGEMENT SYSTEM");
        System.out.println("============================================");
        System.out.println("Enter the number of buses to store : ");
        int size = sc.nextInt();
        buses = new Bus[size];
        int choice;
        System.out.print("Enter Maximum Number of Ticket Bookings : ");
        int ticketSize = sc.nextInt();

        tickets = new Ticket[ticketSize];
        do {
            mainMenu();

            System.out.print("Enter Choice : ");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int busChoice;

                    do {
                        busManagement();

                        busChoice = sc.nextInt();

                        switch (busChoice) {
                            case 1:
                                addBus();
                                break;

                            case 2:
                                displayBus();
                                break;

                            case 3:
                                searchBus();
                                break;

                            case 4:
                                updateBus();
                                break;

                            case 5:
                                deleteBus();
                                break;

                            case 6:
                                break;

                            default:
                                System.out.println("Invalid Choice");
                        }

                    } while (busChoice != 6);

                    break;

                case 2:

                    int routeChoice;

                    do {
                        routeManagement();

                        routeChoice = sc.nextInt();

                        switch (routeChoice) {
                            case 1:
                                searchRoute();
                                break;

                            case 2:
                                displayRoute();
                                break;

                            case 3:
                                displayJourneySchedule();
                                break;

                            case 4:
                                displayRunningDays();
                                break;

                            case 5:
                                displayFare();
                                break;

                            case 6:
                                displayDistance();
                                break;

                            case 7:
                                displayBusType();
                                break;

                            case 8:
                                break;

                            default:
                                System.out.println("Invalid Choice");
                        }

                    } while (routeChoice != 8);

                    break;
                case 3:

                    int ticketChoice;

                    do {
                        ticketManagement();

                        ticketChoice = sc.nextInt();

                        switch (ticketChoice) {
                            case 1:
                                bookTicket();
                                break;

                            case 2:
                                cancelTicket();
                                break;

                            case 3:
                                printTicket();
                                break;

                            case 4:
                                passengerDetails();
                                break;

                            case 5:
                                seatAvailability();
                                break;

                            case 6:
                                break;

                            default:
                                System.out.println("Invalid Choice");
                        }

                    } while (ticketChoice != 6);

                    break;

                case 4:

                    int reportChoice;

                    do {
                        reports();

                        reportChoice = sc.nextInt();

                        switch (reportChoice) {
                            case 1:
                                driverDetails();
                                break;

                            case 2:
                                busStatus();
                                break;

                            case 3:
                                totalCollection();
                                break;

                            case 4:
                                totalBookings();
                                break;

                            case 5:
                                break;

                            default:
                                System.out.println("Invalid Choice");
                        }

                    } while (reportChoice != 5);

                    break;

                case 5:
                    System.out.println("Thanks for visiting!");
                    break;
                default:
                    System.out.println("Try again, your input is invalid");

            }

        } while (choice != 5);

    }
}
