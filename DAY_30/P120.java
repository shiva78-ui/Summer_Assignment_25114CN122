import java.util.*;

public class P120 {
    public static int addCar(int[] carId, String[] carName,
            String[] company, double[] rentPerDay,
            boolean[] available, int count,
            Scanner sc) {

        if (count < carId.length) {

            System.out.println("\n------- Add Car -------");

            System.out.print("Enter Car ID: ");
            carId[count] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Car Name: ");
            carName[count] = sc.nextLine();

            System.out.print("Enter Company Name: ");
            company[count] = sc.nextLine();

            System.out.print("Enter Rent Per Day: ");
            rentPerDay[count] = sc.nextDouble();

            System.out.print("Is Car Available (true/false): ");
            available[count] = sc.nextBoolean();

            count++;

            System.out.println("Car Added Successfully!");

        } else {

            System.out.println("Car Record is Full!");

        }

        return count;
    }

    public static void displayCars(int[] carId, String[] carName,
            String[] company, double[] rentPerDay,
            boolean[] available, int count) {

        System.out.println("\n------- Display All Cars -------");

        if (count == 0) {
            System.out.println("No Car Records Found!");
            return;
        }

        for (int i = 0; i < count; i++) {

            System.out.println("------------------------------");
            System.out.println("Car ID         : " + carId[i]);
            System.out.println("Car Name       : " + carName[i]);
            System.out.println("Company Name   : " + company[i]);
            System.out.println("Rent Per Day   : " + rentPerDay[i]);
            System.out.println("Available      : " + available[i]);
            System.out.println("------------------------------");
        }
    }

    public static void searchCar(int[] carId, String[] carName,
            String[] company, double[] rentPerDay,
            boolean[] available, int count,
            Scanner sc) {

        System.out.println("\n------- Search Car -------");

        if (count == 0) {
            System.out.println("No Car Records Found!");
            return;
        }

        System.out.print("Enter Car ID to Search: ");
        int searchId = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (carId[i] == searchId) {

                System.out.println("\nCar Found!");
                System.out.println("------------------------------");
                System.out.println("Car ID         : " + carId[i]);
                System.out.println("Car Name       : " + carName[i]);
                System.out.println("Company Name   : " + company[i]);
                System.out.println("Rent Per Day   : " + rentPerDay[i]);

                if (available[i]) {
                    System.out.println("Available      : Yes");
                } else {
                    System.out.println("Available      : No");
                }

                System.out.println("------------------------------");

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Car Not Found!");
        }
    }

    public static void updateCar(int[] carId, String[] carName,
            String[] company, double[] rentPerDay,
            boolean[] available, int count,
            Scanner sc) {

        System.out.println("\n------- Update Car -------");

        if (count == 0) {
            System.out.println("No Car Records Found!");
            return;
        }

        System.out.print("Enter Car ID to Update: ");
        int updateId = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (carId[i] == updateId) {

                sc.nextLine();

                System.out.print("Enter New Car Name: ");
                carName[i] = sc.nextLine();

                System.out.print("Enter New Company Name: ");
                company[i] = sc.nextLine();

                System.out.print("Enter New Rent Per Day: ");
                rentPerDay[i] = sc.nextDouble();

                System.out.print("Is Car Available (true/false): ");
                available[i] = sc.nextBoolean();

                System.out.println("Car Updated Successfully!");

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Car Not Found!");
        }
    }

    public static int deleteCar(int[] carId, String[] carName,
            String[] company, double[] rentPerDay,
            boolean[] available, int count,
            Scanner sc) {

        System.out.println("\n------- Delete Car -------");

        if (count == 0) {
            System.out.println("No Car Records Found!");
            return count;
        }

        System.out.print("Enter Car ID to Delete: ");
        int deleteId = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (carId[i] == deleteId) {

                for (int j = i; j < count - 1; j++) {

                    carId[j] = carId[j + 1];
                    carName[j] = carName[j + 1];
                    company[j] = company[j + 1];
                    rentPerDay[j] = rentPerDay[j + 1];
                    available[j] = available[j + 1];

                }

                count--;

                System.out.println("Car Deleted Successfully!");

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Car Not Found!");
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Enter Maximum Number of Cars
        System.out.print("Enter the maximum number of cars: ");
        int size = sc.nextInt();

        // Arrays
        int[] carId = new int[size];
        String[] carName = new String[size];
        String[] company = new String[size];
        double[] rentPerDay = new double[size];
        boolean[] available = new boolean[size];

        // Count Variable
        int count = 0;

        while (true) {

            System.out.println("\n========== CAR RENTAL MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Car");
            System.out.println("2. Display All Cars");
            System.out.println("3. Search Car");
            System.out.println("4. Update Car");
            System.out.println("5. Delete Car");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    count = addCar(carId, carName, company, rentPerDay, available, count, sc);
                    break;

                case 2:
                    displayCars(carId, carName, company, rentPerDay, available, count);
                    break;

                case 3:
                    searchCar(carId, carName, company, rentPerDay, available, count, sc);
                    break;

                case 4:
                    updateCar(carId, carName, company, rentPerDay, available, count, sc);
                    break;

                case 5:
                    count = deleteCar(carId, carName, company, rentPerDay, available, count, sc);
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
