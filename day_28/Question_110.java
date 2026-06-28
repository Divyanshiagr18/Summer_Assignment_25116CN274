package day_27;
import java.util.Scanner;
class BankAccount {
    int accountNo;
    String name;
    double balance;
    // Method to create account
    void createAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        accountNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }
    // Method to deposit money
    void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Deposit Amount: ");
        double amount = sc.nextDouble();

        balance = balance + amount;
        System.out.println("Amount Deposited Successfully!");
    }
    // Method to withdraw money
    void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Withdraw Amount: ");
        double amount = sc.nextDouble();
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn Successfully!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
    // Method to display account details
    void display() {
        System.out.println("\n----- Account Details -----");
        System.out.println("Account Number : " + accountNo);
        System.out.println("Account Holder : " + name);
        System.out.println("Current Balance: " + balance);
    }
}
public class BankAccountSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount();
        b.createAccount();
        int choice;
        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Account");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    b.deposit();
                    break;

                case 2:
                    b.withdraw();
                    break;
                case 3:
                    b.display();
                    break;
                case 4:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);
    }
}