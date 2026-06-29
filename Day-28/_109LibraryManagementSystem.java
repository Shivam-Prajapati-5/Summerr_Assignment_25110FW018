import java.util.Scanner;

class Library {
    String studentName;
    String bookName;
    String issueDate;
    String submissionDate;

    void issueBook(String studentName, String bookName, String issueDate) {
        this.studentName = studentName;
        this.bookName = bookName;
        this.issueDate = issueDate;

        System.out.println("\nBook Issued Successfully!");
    }

    void returnBook(String submissionDate) {
        this.submissionDate = submissionDate;

        System.out.println("Book Returned Successfully!");
    }

    void displayDetails() {
        System.out.println("\n----- Library Record -----");
        System.out.println("Student Name     : " + studentName);
        System.out.println("Book Name        : " + bookName);
        System.out.println("Issue Date       : " + issueDate);
        System.out.println("Submission Date  : " + submissionDate);
    }
}

public class _109LibraryManagementSystem{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Library l1 = new Library();

        System.out.print("Enter Student Name: ");
        String student = sc.nextLine();

        System.out.print("Enter Book Name: ");
        String book = sc.nextLine();

        System.out.print("Enter Issue Date (dd/mm/yyyy): ");
        String issue = sc.nextLine();

        l1.issueBook(student, book, issue);

        System.out.print("Enter Submission Date (dd/mm/yyyy): ");
        String submission = sc.nextLine();

        l1.returnBook(submission);

        l1.displayDetails();
    }
}