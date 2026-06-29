
 import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;}
 public class  _106EmployeeManagement{
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e = new Employee();

        System.out.print("Enter Employee ID: ");
        e.id = sc.nextInt();

        sc.nextLine(); // Consume newline

        System.out.print("Enter Employee Name: ");
        e.name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        e.salary = sc.nextDouble();

        System.out.println("\n--- Employee Record ---");
        System.out.println("Employee ID   : " + e.id);
        System.out.println("Employee Name : " + e.name);
        System.out.println("Salary        : " + e.salary);

        
    }
}

