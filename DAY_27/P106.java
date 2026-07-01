import java.util.*;

public class P106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Employees: ");
        int n = sc.nextInt();
        int[] empId = new int[n];
        String[] name = new String[n];
        int[] age = new int[n];
        String[] department = new String[n];
        double[] salary = new double[n];

        int count = 0;

        while (true) {
            System.out.println("========= Employee Record Management System =========\r\n" + //
                    "\r\n" + //
                    "1. Add Employee\r\n" + //
                    "2. View All Employees\r\n" + //
                    "3. Search Employee\r\n" + //
                    "4. Update Employee\r\n" + //
                    "5. Delete Employee\r\n" + //
                    "6. Exit\r\n" + //
                    "\r\n" + //
                    "Enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (count < n) {
                        System.out.println("Add Employee");

                        System.out.print("Enter Employee ID: ");
                        empId[count] = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter Employee name: ");
                        name[count] = sc.nextLine();
                        System.out.println("Enter Employee age: ");
                        age[count] = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter Employee Department:  ");
                        department[count] = sc.nextLine();
                        System.out.println("Enter your marks: ");
                        salary[count] = sc.nextInt();
                        count++;
                        System.out.println("Student add successfully!");
                    } else {
                        System.out.println("Student record is full");
                    }
                    break;

                case 2:

                    System.out.println("------- View All Employees -------");

                    if (count == 0) {
                        System.out.println("No Employee Records Found!");
                        break;
                    }

                    for (int i = 0; i < count; i++) {

                        System.out.println("------------------------------");
                        System.out.println("Employee Id : " + empId[i]);
                        System.out.println("Name        : " + name[i]);
                        System.out.println("Age         : " + age[i]);
                        System.out.println("Deparment      : " + department[i]);
                        System.out.println("Salary       : " + salary[i]);
                        System.out.println("------------------------------");
                    }

                    break;
                case 3:

                    System.out.println("------- Search Employee -------");

                    if (count == 0) {
                        System.out.println("No Employee Records Found!");
                        break;
                    }

                    System.out.print("Enter Employee Id: ");
                    int searchEmpId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (searchEmpId == empId[i]) {

                            System.out.println("\nEmployee Found!");
                            System.out.println("------------------------------");
                            System.out.println("Employee Id : " + empId[i]);
                            System.out.println("Name        : " + name[i]);
                            System.out.println("Age         : " + age[i]);
                            System.out.println("Deparment      : " + department[i]);
                            System.out.println("Salary       : " + salary[i]);
                            System.out.println("------------------------------");

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Not Found!");
                    }

                    break;
                case 4:
                    System.out.println("------- Update Employee -------");
                    if (count == 0) {
                        System.out.println("No Employee Record found!");
                        break;
                    }
                    System.out.println("Enter the Employee ID: ");
                    int updateempId = sc.nextInt();
                    boolean found1 = false;
                    for (int i = 0; i < count; i++) {

                        if (updateempId == empId[i]) {

                            sc.nextLine();

                            System.out.print("Enter New Name: ");
                            name[i] = sc.nextLine();

                            System.out.print("Enter New Age: ");
                            age[i] = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Enter New deparment: ");
                            department[i] = sc.nextLine();

                            System.out.print("Enter New salary: ");
                            salary[i] = sc.nextInt();

                            System.out.println("Empoyee Updated Successfully!");

                            found1 = true;
                            break;
                        }
                    }

                    if (!found1) {
                        System.out.println("Employee Not Found!");
                    }

                    break;
                case 5:

                    System.out.println("------- Delete Employee -------");
                    if (count == 0) {
                        System.out.println("No Employee Record found!");
                        break;
                    }
                    System.out.println("Enter the Employee Id of the employee whose data is to be deleted: ");
                    int deleteempId = sc.nextInt();
                    boolean found2 = false;
                    for (int i = 0; i < count; i++) {
                        if (deleteempId == empId[i]) {
                            // this loop shifts the position of each index to the left side;
                            for (int j = i; j < count - 1; j++) {
                                empId[j] = empId[j + 1];
                                name[j] = name[j + 1];
                                age[j] = age[j + 1];
                                department[j] = department[j + 1];
                                salary[j] = salary[j + 1];
                            }
                            count--;// Note when employee is added count is increased by 1, and when employee is
                                    // removed by 1 count is decresed by 1!
                            System.out.println("Employee Record deleted Successfully!");
                            found2 = true;
                            break;
                        }

                    }

                    if (!found2) {
                        System.out.println("Employee Not Found!");
                    }
                    break;
                case 6:
                    System.out.println("Thank you!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice! Please try again.");

            }
        }
    }
}
