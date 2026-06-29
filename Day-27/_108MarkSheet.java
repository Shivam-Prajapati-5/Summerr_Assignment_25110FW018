

    import java.util.Scanner;

public class _108MarkSheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int roll;
        int m1, m2, m3, total;
        double percentage;

        System.out.print("Enter Roll Number: ");
        roll = sc.nextInt();

        sc.nextLine(); // Consume newline

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Marks of Subject 1: ");
        m1 = sc.nextInt();

        System.out.print("Enter Marks of Subject 2: ");
        m2 = sc.nextInt();

        System.out.print("Enter Marks of Subject 3: ");
        m3 = sc.nextInt();

        total = m1 + m2 + m3;
        percentage = total / 3.0;

        System.out.println("\n------ MARKSHEET ------");
        System.out.println("Roll Number : " + roll);
        System.out.println("Name        : " + name);
        System.out.println("Subject 1   : " + m1);
        System.out.println("Subject 2   : " + m2);
        System.out.println("Subject 3   : " + m3);
        System.out.println("Total Marks : " + total);
        System.out.println("Percentage  : " + percentage + "%");
    }
}

