import java.util.*;

public class P119 {
    public static int addEmployee(int[] empId, String[] empName,
            int[] age, String[] department,
            double[] salary, int count,
            Scanner sc) {

        if (count < empId.length) {

            System.out.println("\n------- Add Employee -------");

            System.out.print("Enter Employee ID: ");
            empId[count] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            empName[count] = sc.nextLine();

            System.out.print("Enter Employee Age: ");
            age[count] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Department: ");
            department[count] = sc.nextLine();

            System.out.print("Enter Salary: ");
            salary[count] = sc.nextDouble();

            count++;

            System.out.println("Employee Added Successfully!");

        } else {

            System.out.println("Employee Record is Full!");

        }

        return count;
    }

    public static void displayEmployees(int[] empId, String[] empName,
            int[] age, String[] department,
            double[] salary, int count) {

        System.out.println("\n------- Display All Employees -------");

        if (count == 0) {
            System.out.println("No Employee Records Found!");
            return;
        }

        for (int i = 0; i < count; i++) {

            System.out.println("------------------------------");
            System.out.println("Employee ID   : " + empId[i]);
            System.out.println("Employee Name : " + empName[i]);
            System.out.println("Age           : " + age[i]);
            System.out.println("Department    : " + department[i]);
            System.out.println("Salary        : " + salary[i]);
            System.out.println("------------------------------");
        }
    }

    public static void searchEmployee(int[] empId, String[] empName,
            int[] age, String[] department,
            double[] salary, int count,
            Scanner sc) {

        System.out.println("\n------- Search Employee -------");

        if (count == 0) {
            System.out.println("No Employee Records Found!");
            return;
        }

        System.out.print("Enter Employee ID: ");
        int searchId = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (empId[i] == searchId) {

                System.out.println("\nEmployee Found!");
                System.out.println("------------------------------");
                System.out.println("Employee ID   : " + empId[i]);
                System.out.println("Employee Name : " + empName[i]);
                System.out.println("Age           : " + age[i]);
                System.out.println("Department    : " + department[i]);
                System.out.println("Salary        : " + salary[i]);
                System.out.println("------------------------------");

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee Not Found!");
        }
    }

    public static void updateEmployee(int[] empId, String[] empName,
            int[] age, String[] department,
            double[] salary, int count,
            Scanner sc) {

        System.out.println("\n------- Update Employee -------");

        if (count == 0) {
            System.out.println("No Employee Records Found!");
            return;
        }

        System.out.print("Enter Employee ID to Update: ");
        int updateId = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (empId[i] == updateId) {

                sc.nextLine();

                System.out.print("Enter New Employee Name: ");
                empName[i] = sc.nextLine();

                System.out.print("Enter New Age: ");
                age[i] = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter New Department: ");
                department[i] = sc.nextLine();

                System.out.print("Enter New Salary: ");
                salary[i] = sc.nextDouble();

                System.out.println("Employee Updated Successfully!");

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee Not Found!");
        }
    }

    public static int deleteEmployee(int[] empId, String[] empName,
            int[] age, String[] department,
            double[] salary, int count,
            Scanner sc) {

        System.out.println("\n------- Delete Employee -------");

        if (count == 0) {
            System.out.println("No Employee Records Found!");
            return count;
        }

        System.out.print("Enter Employee ID to Delete: ");
        int deleteId = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (empId[i] == deleteId) {

                for (int j = i; j < count - 1; j++) {

                    empId[j] = empId[j + 1];
                    empName[j] = empName[j + 1];
                    age[j] = age[j + 1];
                    department[j] = department[j + 1];
                    salary[j] = salary[j + 1];

                }

                count--;

                System.out.println("Employee Deleted Successfully!");

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee Not Found!");
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Maximum Number of Employees: ");
        int size = sc.nextInt();

        // Arrays
        int[] empId = new int[size];
        String[] empName = new String[size];
        int[] age = new int[size];
        String[] department = new String[size];
        double[] salary = new double[size];

        int count = 0;

        while (true) {

            System.out.println("\n========== EMPLOYEE MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");

            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    count = addEmployee(empId, empName, age, department, salary, count, sc);
                    break;

                case 2:
                    displayEmployees(empId, empName, age, department, salary, count);
                    break;

                case 3:
                    searchEmployee(empId, empName, age, department, salary, count, sc);
                    break;

                case 4:
                    updateEmployee(empId, empName, age, department, salary, count, sc);
                    break;

                case 5:
                    count = deleteEmployee(empId, empName, age, department, salary, count, sc);
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