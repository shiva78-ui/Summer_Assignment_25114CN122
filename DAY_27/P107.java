import java.util.*;

public class P107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees");
        int n = sc.nextInt();
        int EmpId[] = new int[n];
        String EmpName[] = new String[n];
        double EmpBasicSalary[] = new double[n];
        double EmpHra[] = new double[n];
        double EmpDa[] = new double[n];
        double EmpBonus[] = new double[n];
        double EmpSalaryDeduction[] = new double[n];
        double EmpNetSalary[] = new double[n];
        double EmpSalary[] = new double[n];
        int count = 0;
        while (true) {
            System.out.println("========= Salary Management System =========\r\n" + //
                    "\r\n" + //
                    "1. Add Employee Salary\r\n" + //
                    "2. View Salary\r\n" + //
                    "3. Search Employee Salary\r\n" + //
                    "4. Update Salary\r\n" + //
                    "5. Delete Employee\r\n" + //
                    "6. Exit");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:

                    if (count < n) {

                        System.out.println("------- Add Employee Salary -------");

                        System.out.print("Enter Employee ID: ");
                        EmpId[count] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Employee Name: ");
                        EmpName[count] = sc.nextLine();

                        System.out.print("Enter Basic Salary: ");
                        EmpBasicSalary[count] = sc.nextDouble();

                        System.out.print("Enter HRA: ");
                        EmpHra[count] = sc.nextDouble();

                        System.out.print("Enter DA: ");
                        EmpDa[count] = sc.nextDouble();

                        System.out.print("Enter Bonus: ");
                        EmpBonus[count] = sc.nextDouble();

                        System.out.print("Enter Salary Deduction: ");
                        EmpSalaryDeduction[count] = sc.nextDouble();

                        // Calculate Gross Salary
                        EmpSalary[count] = EmpBasicSalary[count]
                                + EmpHra[count]
                                + EmpDa[count]
                                + EmpBonus[count];

                        // Calculate Net Salary
                        EmpNetSalary[count] = EmpSalary[count]
                                - EmpSalaryDeduction[count];

                        System.out.println("Employee Salary Record Added Successfully!");

                        count++;

                    } else {

                        System.out.println("Employee Record is Full!");

                    }

                    break;
                case 2:
                    System.out.println("------View Salary Record------");
                    if (count == 0) {
                        System.out.println("No Employee Record found");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println("----------------------------------");
                            System.out.println("Employee ID        : " + EmpId[i]);
                            System.out.println("Employee Name      : " + EmpName[i]);
                            System.out.println("Basic Salary       : " + EmpBasicSalary[i]);
                            System.out.println("HRA                : " + EmpHra[i]);
                            System.out.println("DA                 : " + EmpDa[i]);
                            System.out.println("Bonus              : " + EmpBonus[i]);
                            System.out.println("Salary Deduction   : " + EmpSalaryDeduction[i]);
                            System.out.println("Gross Salary       : " + EmpSalary[i]);
                            System.out.println("Net Salary         : " + EmpNetSalary[i]);
                            System.out.println("----------------------------------");
                        }
                    }

                    break;
                case 3:
                    System.out.println("------- Search Employee Salary-------");
                    if (count == 0) {
                        System.out.println("No employee record found");
                    } else {
                        System.out.print("Enter Employee Id: ");
                        int searchEmpId = sc.nextInt();
                        for (int i = 0; i < count; i++) {
                            if (searchEmpId == EmpId[i]) {
                                System.out.println("Employee Found!");
                                System.out.println("----------------------------------");
                                System.out.println("Employee ID        : " + EmpId[i]);
                                System.out.println("Employee Name      : " + EmpName[i]);
                                System.out.println("Basic Salary       : " + EmpBasicSalary[i]);
                                System.out.println("HRA                : " + EmpHra[i]);
                                System.out.println("DA                 : " + EmpDa[i]);
                                System.out.println("Bonus              : " + EmpBonus[i]);
                                System.out.println("Salary Deduction   : " + EmpSalaryDeduction[i]);
                                System.out.println("Gross Salary       : " + EmpSalary[i]);
                                System.out.println("Net Salary         : " + EmpNetSalary[i]);
                                System.out.println("----------------------------------");
                            } else {
                                System.out.println("Employee Not Found!");
                            }
                        }
                    }
                case 4:
                    System.out.println("------- Update Employee Salary-------");
                    if (count == 0) {
                        System.out.println("No Employee Record found!");
                        break;
                    }
                    System.out.print("Enter Employee Id: ");
                    int updateEmpId = sc.nextInt();
                    for (int i = 0; i < count; i++) {
                        if (updateEmpId == EmpId[i]) {
                            System.out.println("Employee Found!");
                            System.out.println("Enter New Basic Salary: ");
                            EmpBasicSalary[i] = sc.nextDouble();
                            System.out.println("Enter New HRA: ");
                            EmpHra[i] = sc.nextDouble();
                            System.out.println("Enter New DA: ");
                            EmpDa[i] = sc.nextDouble();
                            System.out.println("Enter New Bonus: ");
                            EmpBonus[i] = sc.nextDouble();
                            System.out.println("Enter New Salary Deduction: ");
                            EmpSalaryDeduction[i] = sc.nextDouble();
                            // Calculate Gross Salary
                            EmpSalary[i] = EmpBasicSalary[i]
                                    + EmpHra[i]
                                    + EmpDa[i]
                                    + EmpBonus[i];

                            // Calculate Net Salary
                            EmpNetSalary[i] = EmpSalary[i]
                                    - EmpSalaryDeduction[i];
                            System.out.println("Employee Salary Record Updated Successfully!");
                        } else {
                            System.out.println("Employee Not Found!");
                        }
                    }
                case 5:
                    System.out.println("------- Delete Employee Salary-------");
                    if (count == 0) {
                        System.out.println("No Employee Record found!");
                        break;
                    }
                    System.out.print("Enter Employee Id: ");
                    int deleteEmpId = sc.nextInt();
                    for (int i = 0; i < count; i++) {
                        if (deleteEmpId == EmpId[i]) {
                            System.out.println("Employee Found!");
                            for (int j = i; j < count - 1; j++) {
                                EmpId[j] = EmpId[j + 1];
                                EmpName[j] = EmpName[j + 1];
                                EmpBasicSalary[j] = EmpBasicSalary[j + 1];
                                EmpHra[j] = EmpHra[j + 1];
                                EmpDa[j] = EmpDa[j + 1];
                                EmpBonus[j] = EmpBonus[j + 1];
                                EmpSalaryDeduction[j] = EmpSalaryDeduction[j + 1];
                                EmpSalary[j] = EmpSalary[j + 1];
                                EmpNetSalary[j] = EmpNetSalary[j + 1];
                            }
                            count--;
                            System.out.println("Employee Salary Record Deleted Successfully!");
                        } else {
                            System.out.println("Employee Not Found!");
                        }
                    }
                case 6:
                    System.out.println("Exiting the program...");
                    System.out.println("Thank you for using the Salary Management System!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

    }
}
