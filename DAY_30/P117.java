import java.util.*;

public class P117 {
    public static int addStudent(int[] rollNo, String[] name, int[] age,
            String[] course, int[] marks, char[] grade,
            int count, Scanner sc) {

        if (count < rollNo.length) {

            System.out.println("\n------- Add Student -------");

            System.out.print("Enter Roll Number: ");
            rollNo[count] = sc.nextInt();
            sc.nextLine();// Consume the newline character

            System.out.print("Enter Name: ");
            name[count] = sc.nextLine();

            System.out.print("Enter Age: ");
            age[count] = sc.nextInt();
            sc.nextLine();// Consume the newline character

            System.out.print("Enter Course: ");
            course[count] = sc.nextLine();

            System.out.print("Enter Marks: ");
            marks[count] = sc.nextInt();

            grade[count] = '-'; // Grade will be calculated later

            count++;

            System.out.println("Student Added Successfully!");

        } else {

            System.out.println("Student Record is Full!");

        }

        return count;
    }

    public static void displayStudents(int[] rollNo, String[] name, int[] age,
            String[] course, int[] marks, char[] grade,
            int count) {

        System.out.println("\n------- Display All Students -------");

        if (count == 0) {
            System.out.println("No Student Records Found!");
            return;
        }

        for (int i = 0; i < count; i++) {

            System.out.println("------------------------------");
            System.out.println("Roll Number : " + rollNo[i]);
            System.out.println("Name        : " + name[i]);
            System.out.println("Age         : " + age[i]);
            System.out.println("Course      : " + course[i]);
            System.out.println("Marks       : " + marks[i]);
            System.out.println("Grade       : " + grade[i]);
            System.out.println("------------------------------");
        }
    }

    public static void searchStudent(int[] rollNo, String[] name, int[] age,
            String[] course, int[] marks, char[] grade,
            int count, Scanner sc) {

        System.out.println("\n------- Search Student -------");

        if (count == 0) {
            System.out.println("No Student Records Found!");
            return;
        }

        System.out.print("Enter Roll Number to Search: ");
        int searchRollNo = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (rollNo[i] == searchRollNo) {

                System.out.println("\nStudent Found!");
                System.out.println("------------------------------");
                System.out.println("Roll Number : " + rollNo[i]);
                System.out.println("Name        : " + name[i]);
                System.out.println("Age         : " + age[i]);
                System.out.println("Course      : " + course[i]);
                System.out.println("Marks       : " + marks[i]);
                System.out.println("Grade       : " + grade[i]);
                System.out.println("------------------------------");

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found!");
        }
    }

    public static void updateStudent(int[] rollNo, String[] name, int[] age,
            String[] course, int[] marks, char[] grade,
            int count, Scanner sc) {

        System.out.println("\n------- Update Student -------");

        if (count == 0) {
            System.out.println("No Student Records Found!");
            return;
        }

        System.out.print("Enter Roll Number to Update: ");
        int updateRollNo = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (rollNo[i] == updateRollNo) {

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

                grade[i] = '-'; // Grade will be recalculated later

                System.out.println("Student Updated Successfully!");

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found!");
        }
    }

    public static int deleteStudent(int[] rollNo, String[] name, int[] age,
            String[] course, int[] marks, char[] grade,
            int count, Scanner sc) {

        System.out.println("\n------- Delete Student -------");

        if (count == 0) {
            System.out.println("No Student Records Found!");
            return count;
        }

        System.out.print("Enter Roll Number to Delete: ");
        int deleteRollNo = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (rollNo[i] == deleteRollNo) {

                for (int j = i; j < count - 1; j++) {

                    rollNo[j] = rollNo[j + 1];
                    name[j] = name[j + 1];
                    age[j] = age[j + 1];
                    course[j] = course[j + 1];
                    marks[j] = marks[j + 1];
                    grade[j] = grade[j + 1];

                }

                count--;

                System.out.println("Student Deleted Successfully!");

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found!");
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Enter Maximum Number of Students
        System.out.print("Enter the maximum number of students: ");
        int size = sc.nextInt();

        // Arrays
        int[] rollNo = new int[size];
        String[] name = new String[size];
        int[] age = new int[size];
        String[] course = new String[size];
        int[] marks = new int[size];
        char[] grade = new char[size];

        // Count Variable
        int count = 0;

        while (true) {

            System.out.println("\n========== STUDENT MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    count = addStudent(rollNo, name, age, course, marks, grade, count, sc);
                    break;

                case 2:
                    displayStudents(rollNo, name, age, course, marks, grade, count);
                    break;

                case 3:
                    searchStudent(rollNo, name, age, course, marks, grade, count, sc);
                    break;

                case 4:
                    updateStudent(rollNo, name, age, course, marks, grade, count, sc);
                    break;

                case 5:
                    count = deleteStudent(rollNo, name, age, course, marks, grade, count, sc);
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