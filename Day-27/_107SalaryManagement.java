
    import java.util.Scanner;
public class _107SalaryManagement{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int empId;
        String empName;
        double basicSalary, hra, da, totalSalary;

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();

        sc.nextLine(); // Consume newline

        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();

        hra = basicSalary * 0.20; // 20% HRA
        da = basicSalary * 0.10;  // 10% DA
        totalSalary = basicSalary + hra + da;

        System.out.println("\n--- Salary Details ---");
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("HRA           : " + hra);
        System.out.println("DA            : " + da);
        System.out.println("Total Salary  : " + totalSalary);

        sc.close();
    }
}
