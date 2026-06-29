import java.util.Scanner;

class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    void createAccount(String name, int accNo, double amount) {
        accountHolder = name;
        accountNumber = accNo;
        balance = amount;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited Successfully!");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn Successfully!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void display() {
        System.out.println("\n----- Account Details -----");
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance : " + balance);
    }
}

public class _110BankAccountSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount b1 = new BankAccount();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        double amount = sc.nextDouble();

        b1.createAccount(name, accNo, amount);

        System.out.print("Enter Amount to Deposit: ");
        double depositAmount = sc.nextDouble();
        b1.deposit(depositAmount);

        System.out.print("Enter Amount to Withdraw: ");
        double withdrawAmount = sc.nextDouble();
        b1.withdraw(withdrawAmount);

        b1.display();
    }
}