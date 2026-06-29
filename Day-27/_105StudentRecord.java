import java.util.*;

class Student {
    int roll;
    String name;
    int age;
    double marks;

    Student(int roll, String name, int age, double marks) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void display() {
        System.out.println("Roll No : " + roll);
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Marks   : " + marks);
        System.out.println();
    }
}

public class _105StudentRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n===== Student Record Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll Number: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    students.add(new Student(roll, name, age, marks));
                    System.out.println("Student Added Successfully!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No Records Found!");
                    } else {
                        for (Student s : students) {
                            s.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll Number to Search: ");
                    roll = sc.nextInt();
                    boolean found = false;

                    for (Student s : students) {
                        if (s.roll == roll) {
                            s.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student Not Found!");
                    break;

                case 4:
                    System.out.print("Enter Roll Number to Update: ");
                    roll = sc.nextInt();
                    sc.nextLine();
                    found = false;

                    for (Student s : students) {
                        if (s.roll == roll) {
                            System.out.print("Enter New Name: ");
                            s.name = sc.nextLine();

                            System.out.print("Enter New Age: ");
                            s.age = sc.nextInt();

                            System.out.print("Enter New Marks: ");
                            s.marks = sc.nextDouble();

                            System.out.println("Record Updated Successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student Not Found!");
                    break;

                case 5:
                    System.out.print("Enter Roll Number to Delete: ");
                    roll = sc.nextInt();
                    found = false;

                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).roll == roll) {
                            students.remove(i);
                            System.out.println("Record Deleted Successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student Not Found!");
                    break;

                case 6:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

    }
}