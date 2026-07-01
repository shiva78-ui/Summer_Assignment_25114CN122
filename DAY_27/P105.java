import java.util.*;

public class P105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of student: ");
        int n = sc.nextInt();
        int[] rollno = new int[n];
        String[] name = new String[n];
        int[] age = new int[n];
        String[] course = new String[n];
        int[] marks = new int[n];
        int count = 0;

        while (true) {
            System.out.println("========= Student Record Management System =========\r\n" + //
                    "\r\n" + //
                    "1. Add Student\r\n" + //
                    "2. View Student\r\n" + //
                    "3. Search Student\r\n" + //
                    "4. Update Student\r\n" + //
                    "5. Delete Student\r\n" + //
                    "6. Exit\r\n" + //
                    "\r\n" + //
                    "Enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (count < 5) {
                        System.out.println("Add Student");

                        System.out.print("Enter Roll Number: ");
                        rollno[count] = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter your name: ");
                        name[count] = sc.nextLine();
                        System.out.println("Enter Your age: ");
                        age[count] = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter Your course: ");
                        course[count] = sc.nextLine();
                        System.out.println("Enter your marks: ");
                        marks[count] = sc.nextInt();
                        count++;
                        System.out.println("Student add successfully!");
                    } else {
                        System.out.println("Student record is full");
                    }
                    break;

                case 2:

                    System.out.println("------- View All Students -------");

                    if (count == 0) {
                        System.out.println("No Student Records Found!");
                        break;
                    }

                    for (int i = 0; i < count; i++) {

                        System.out.println("------------------------------");
                        System.out.println("Roll Number : " + rollno[i]);
                        System.out.println("Name        : " + name[i]);
                        System.out.println("Age         : " + age[i]);
                        System.out.println("Course      : " + course[i]);
                        System.out.println("Marks       : " + marks[i]);
                        System.out.println("------------------------------");
                    }

                    break;
                case 3:

                    System.out.println("------- Search Student -------");

                    if (count == 0) {
                        System.out.println("No Student Records Found!");
                        break;
                    }

                    System.out.print("Enter Student Roll Number: ");
                    int searchRollNo = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (searchRollNo == rollno[i]) {

                            System.out.println("\nStudent Found!");
                            System.out.println("------------------------------");
                            System.out.println("Roll Number : " + rollno[i]);
                            System.out.println("Name        : " + name[i]);
                            System.out.println("Age         : " + age[i]);
                            System.out.println("Course      : " + course[i]);
                            System.out.println("Marks       : " + marks[i]);
                            System.out.println("------------------------------");

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found!");
                    }

                    break;
                case 4:
                    System.out.println("------- Update Student -------");
                    if (count == 0) {
                        System.out.println("No Student Record found!");
                        break;
                    }
                    System.out.println("Enter the Student Rollno: ");
                    int updateRollNo = sc.nextInt();
                    boolean found1 = false;
                    for (int i = 0; i < count; i++) {

                        if (updateRollNo == rollno[i]) {

                            sc.nextLine();

                            System.out.print("Enter New Name: ");
                            name[i] = sc.nextLine();

                            System.out.print("Enter New Age: ");
                            age[i] = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Enter New Course: ");
                            course[i] = sc.nextLine();

                            System.out.print("Enter New Marks: ");
                            marks[i] = sc.nextInt();

                            System.out.println("Student Updated Successfully!");

                            found1 = true;
                            break;
                        }
                    }

                    if (!found1) {
                        System.out.println("Student Not Found!");
                    }

                    break;
                case 5:

                    System.out.println("------- Delete Student -------");
                    if (count == 0) {
                        System.out.println("No Student Record found!");
                        break;
                    }
                    System.out.println("Enter the Rollno of the student whose data is to be deleted: ");
                    int deleteRollNo = sc.nextInt();
                    boolean found2 = false;
                    for (int i = 0; i < count; i++) {
                        if (deleteRollNo == rollno[i]) {
                            // this loop shifts the position of each index to the left side;
                            for (int j = i; j < count - 1; j++) {
                                rollno[j] = rollno[j + 1];
                                name[j] = name[j + 1];
                                age[j] = age[j + 1];
                                course[j] = course[j + 1];
                                marks[j] = marks[j + 1];
                            }
                            count--;// Note when student is added count is increased by 1, and when student is
                                    // removed by 1 count is decresed by 1!
                            System.out.println("Student Record deleted Successfully!");
                            found2 = true;
                            break;
                        }

                    }

                    if (!found2) {
                        System.out.println("Student Not Found!");
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
