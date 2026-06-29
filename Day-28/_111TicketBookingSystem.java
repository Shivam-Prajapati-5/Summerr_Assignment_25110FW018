
import java.util.Scanner;

class Ticket {
    String passengerName;
    String source;
    String destination;
    int seatNumber;

    void bookTicket(String name, String src, String dest, int seat) {
        passengerName = name;
        source = src;
        destination = dest;
        seatNumber = seat;

        System.out.println("\nTicket Booked Successfully!");
    }

    void displayTicket() {
        System.out.println("\n----- Ticket Details -----");
        System.out.println("Passenger Name : " + passengerName);
        System.out.println("Source : " + source);
        System.out.println("Destination : " + destination);
        System.out.println("Seat Number : " + seatNumber);
    }
}

public class _111TicketBookingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Ticket t1 = new Ticket();

        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Source: ");
        String source = sc.nextLine();

        System.out.print("Enter Destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter Seat Number: ");
        int seat = sc.nextInt();

        t1.bookTicket(name, source, destination, seat);

        t1.displayTicket();

        
    }
}