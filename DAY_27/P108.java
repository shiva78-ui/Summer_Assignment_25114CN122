import java.util.*;

public class P108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        String[] studentName = new String[n];
        String[] fatherName = new String[n];
        String[] studentClass = new String[n];

        int[] rollNo = new int[n];

        int[] english = new int[n];
        int[] hindi = new int[n];
        int[] maths = new int[n];
        int[] science = new int[n];
        int[] socialScience = new int[n];

        int[] grandTotal = new int[n];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        int count = 0;
        while (true) {
            System.out.println("========= Marksheet Generation System =========\r\n" + //
                    "\r\n" + //
                    "1. Add Student Record\r\n" + //
                    "2. View All Marksheets\r\n" + //
                    "3. Search Marksheet\r\n" + //
                    "4. Update Marksheet\r\n" + //
                    "5. Delete Marksheet\r\n" + //
                    "6. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:

                    if (count < n) {

                        System.out.println("------- Add Student Record -------");

                        System.out.print("Enter Student Name: ");
                        sc.nextLine();
                        studentName[count] = sc.nextLine();

                        System.out.print("Enter Father Name: ");
                        fatherName[count] = sc.nextLine();

                        System.out.print("Enter Class: ");
                        studentClass[count] = sc.nextLine();

                        System.out.print("Enter Roll Number: ");
                        rollNo[count] = sc.nextInt();

                        System.out.print("Enter English Marks: ");
                        english[count] = sc.nextInt();

                        System.out.print("Enter Hindi Marks: ");
                        hindi[count] = sc.nextInt();

                        System.out.print("Enter Maths Marks: ");
                        maths[count] = sc.nextInt();

                        System.out.print("Enter Science Marks: ");
                        science[count] = sc.nextInt();

                        System.out.print("Enter Social Science Marks: ");
                        socialScience[count] = sc.nextInt();

                        // Calculate Grand Total
                        grandTotal[count] = english[count]
                                + hindi[count]
                                + maths[count]
                                + science[count]
                                + socialScience[count];

                        // Calculate Percentage
                        percentage[count] = (grandTotal[count] / 500.0) * 100;

                        // Decide Grade
                        if (percentage[count] >= 90) {
                            grade[count] = "A+";
                        } else if (percentage[count] >= 80) {
                            grade[count] = "A";
                        } else if (percentage[count] >= 70) {
                            grade[count] = "B+";
                        } else if (percentage[count] >= 60) {
                            grade[count] = "B";
                        } else if (percentage[count] >= 50) {
                            grade[count] = "C";
                        } else if (percentage[count] >= 40) {
                            grade[count] = "D";
                        } else {
                            grade[count] = "F";
                        }

                        System.out.println("Marksheet Generated Successfully!");

                        count++;

                    } else {

                        System.out.println("Student Record is Full!");

                    }

                    break;
                case 2:

                    System.out.println("------- View All Marksheets -------");

                    if (count == 0) {
                        System.out.println("No Student Records Found!");
                        break;
                    }

                    for (int i = 0; i < count; i++) {

                        System.out.println("=======================================");
                        System.out.println("Student Name      : " + studentName[i]);
                        System.out.println("Father Name       : " + fatherName[i]);
                        System.out.println("Class             : " + studentClass[i]);
                        System.out.println("Roll Number       : " + rollNo[i]);

                        System.out.println("\n--------- Subject Marks ---------");
                        System.out.println("English           : " + english[i]);
                        System.out.println("Hindi             : " + hindi[i]);
                        System.out.println("Maths             : " + maths[i]);
                        System.out.println("Science           : " + science[i]);
                        System.out.println("Social Science    : " + socialScience[i]);

                        System.out.println("\n--------- Result ---------");
                        System.out.println("Grand Total       : " + grandTotal[i] + " / 500");
                        System.out.println("Percentage        : " + percentage[i] + "%");
                        System.out.println("Grade             : " + grade[i]);
                        System.out.println("=======================================");
                    }

                    break;
                case 3:
                    System.out.println("------- Search Marksheets -------");
                    if (count == 0) {
                        System.out.println("Enter No Record Found");
                        break;
                    } else {
                        System.out.println("Enter the Roll Number:");
                        int searchRollNo = sc.nextInt();
                        boolean found = false;
                        for (int i = 0; i < count; i++) {
                            if (searchRollNo == rollNo[i]) {

                                System.out.println("\n========== MARKSHEET ==========");
                                System.out.println("Student Name      : " + studentName[i]);
                                System.out.println("Father Name       : " + fatherName[i]);
                                System.out.println("Class             : " + studentClass[i]);
                                System.out.println("Roll Number       : " + rollNo[i]);

                                System.out.println("\n------ Subject Marks ------");
                                System.out.println("English           : " + english[i]);
                                System.out.println("Hindi             : " + hindi[i]);
                                System.out.println("Maths             : " + maths[i]);
                                System.out.println("Science           : " + science[i]);
                                System.out.println("Social Science    : " + socialScience[i]);

                                System.out.println("\n------ Result ------");
                                System.out.println("Grand Total       : " + grandTotal[i] + " / 500");
                                System.out.println("Percentage        : " + percentage[i] + "%");
                                System.out.println("Grade             : " + grade[i]);
                                System.out.println("==============================");

                                found = true;
                                break;
                            }
                        }
                    }
                case 4:
                    System.out.println("------- Update Marksheet -------");
                    if (count == 0) {
                        System.out.println("No Record is found");
                        break;
                    } else {
                        System.out.println("Enter Roll Number: ");
                        int updateRollNo = sc.nextInt();
                        boolean found = false;
                        for (int i = 0; i < count; i++) {
                            if (updateRollNo == rollNo[i]) {
                                System.out.print("Enter New English Marks: ");
                                english[i] = sc.nextInt();

                                System.out.print("Enter New Hindi Marks: ");
                                hindi[i] = sc.nextInt();

                                System.out.print("Enter New Maths Marks: ");
                                maths[i] = sc.nextInt();

                                System.out.print("Enter New Science Marks: ");
                                science[i] = sc.nextInt();

                                System.out.print("Enter New Social Science Marks: ");
                                socialScience[i] = sc.nextInt();

                                // Recalculate Grand Total
                                grandTotal[i] = english[i]
                                        + hindi[i]
                                        + maths[i]
                                        + science[i]
                                        + socialScience[i];

                                // Recalculate Percentage
                                percentage[i] = (grandTotal[i] / 500.0) * 100;

                                // Recalculate Grade
                                if (percentage[i] >= 90) {
                                    grade[i] = "A+";
                                } else if (percentage[i] >= 80) {
                                    grade[i] = "A";
                                } else if (percentage[i] >= 70) {
                                    grade[i] = "B+";
                                } else if (percentage[i] >= 60) {
                                    grade[i] = "B";
                                } else if (percentage[i] >= 50) {
                                    grade[i] = "C";
                                } else if (percentage[i] >= 40) {
                                    grade[i] = "D";
                                } else {
                                    grade[i] = "F";
                                }

                                System.out.println("Marksheet Updated Successfully!");

                                found = true;
                                break;
                            }

                        }
                        if (!found) {
                            System.out.println("Student Not Found!");
                        }

                        break;
                    }
                case 5:
                    System.out.println("------- Delete Marksheet -------");
                    if (count == 0) {
                        System.out.println("No Record found");
                        break;
                    } else {
                        System.out.print("Enter Roll Number: ");
                        int deleteRollNo = sc.nextInt();

                        boolean found = false;

                        for (int i = 0; i < count; i++) {

                            if (deleteRollNo == rollNo[i]) {

                                // Shift all records one position to the left
                                for (int j = i; j < count - 1; j++) {

                                    studentName[j] = studentName[j + 1];
                                    fatherName[j] = fatherName[j + 1];
                                    studentClass[j] = studentClass[j + 1];
                                    rollNo[j] = rollNo[j + 1];

                                    english[j] = english[j + 1];
                                    hindi[j] = hindi[j + 1];
                                    maths[j] = maths[j + 1];
                                    science[j] = science[j + 1];
                                    socialScience[j] = socialScience[j + 1];

                                    grandTotal[j] = grandTotal[j + 1];
                                    percentage[j] = percentage[j + 1];
                                    grade[j] = grade[j + 1];
                                }

                                count--;

                                System.out.println("Marksheet Deleted Successfully!");

                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Student Not Found!");
                        }

                        break;
                    }
                case 6:
                    System.out.println("Exiting the program,Thanks for visiting!");
                    sc.close();
                    return;

                default:
                    break;
            }
        }
    }
}
