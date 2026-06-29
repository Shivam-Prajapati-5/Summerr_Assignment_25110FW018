
import java.util.Scanner;

class Contact {
    String name;
    String phoneNumber;
    String email;

    void addContact(String name, String phone, String email) {
        this.name = name;
        this.phoneNumber = phone;
        this.email = email;

        System.out.println("\nContact Added Successfully!");
    }

    void displayContact() {
        System.out.println("\n----- Contact Details -----");
        System.out.println("Name         : " + name);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Email        : " + email);
    }
}

public class _112ContentManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Contact c1 = new Contact();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        c1.addContact(name, phone, email);

        c1.displayContact();

        
    }
}