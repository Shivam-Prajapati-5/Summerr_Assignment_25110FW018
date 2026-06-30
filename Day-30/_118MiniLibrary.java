
import java.util.Scanner;

public class _118MiniLibrary   {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = new String[5];

        // Add books
        System.out.println("Enter names of 5 books:");
        for (int i = 0; i < books.length; i++) {
            System.out.print("Book " + (i + 1) + ": ");
            books[i] = sc.nextLine();
        }

        // Display books
        System.out.println("\n===== LIBRARY BOOK LIST =====");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }

        // Search a book
        System.out.print("\nEnter book name to search: ");
        String searchBook = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < books.length; i++) {
            if (books[i].equalsIgnoreCase(searchBook)) {
                System.out.println("Book found in the library.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found in the library.");
        }

        sc.close();
    }
}

jh