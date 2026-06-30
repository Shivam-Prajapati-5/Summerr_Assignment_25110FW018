
import java.util.Scanner;

public class  _120MiniProject {

    static int[] rollNo = new int[100];
    static String[] name = new String[100];
    static double[] marks = new double[100];
    static int count = 0;

    // Function to add a student
    public static void addStudent(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        rollNo[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name[count] = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks[count] = sc.nextDouble();

        count++;
        System.out.println("Student record added successfully.");
    }

    // Function to display all students
    public static void displayStudents() {
        if (count == 0) {
            System.out.println("No records found.");
            return;
        }

        System.out.println("\n----- Student Records -----");
        for (int i = 0; i < count; i++) {
            System.out.println("Roll No: " + rollNo[i]);
            System.out.println("Name: " + name[i]);
            System.out.println("Marks: " + marks[i]);
            System.out.println();
        }
    }

    // Function to search a student
    public static void searchStudent(Scanner sc) {
        System.out.print("Enter Roll Number to search: ");
        int searchRoll = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (rollNo[i] == searchRoll) {
                System.out.println("Student Found!");
                System.out.println("Name: " + name[i]);
                System.out.println("Marks: " + marks[i]);
                return;
            }
        }

        System.out.println("Student not found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchStudent(sc);
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}

