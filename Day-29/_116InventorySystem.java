
import java.util.Scanner;

class Product {
    int id;
    String name;
    int quantity;
    double price;

    void addProduct(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    void displayProduct() {
        System.out.println("\nProduct ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: ₹" + price);
    }
}

public class _116InventorySystem  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product p = new Product();

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        p.addProduct(id, name, quantity, price);

        System.out.println("\n===== INVENTORY DETAILS =====");
        p.displayProduct();

        sc.close();
    }
}

