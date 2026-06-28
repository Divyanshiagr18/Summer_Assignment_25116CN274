package day_28;
import java.util.Scanner;

class Contact {
    String name;
    String phone;

    // Method to add contact
    void addContact() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Contact Name: ");
        name = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        phone = sc.nextLine();
    }

    // Method to display contact
    void displayContact() {
        System.out.println("Name  : " + name);
        System.out.println("Phone : " + phone);
    }
}

public class ContactManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Contacts: ");
        int n = sc.nextInt();
        sc.nextLine();

        Contact[] c = new Contact[n];

        // Add Contacts
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter Details of Contact " + (i + 1));
            c[i] = new Contact();
            c[i].addContact();
        }

        // Display Contacts
        System.out.println("\n----- Contact List -----");
        for (int i = 0; i < n; i++) {
            c[i].displayContact();
            System.out.println();
        }

        // Search Contact
        System.out.print("Enter Contact Name to Search: ");
        String search = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (c[i].name.equalsIgnoreCase(search)) {
                System.out.println("\nContact Found");
                c[i].displayContact();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact Not Found!");
        }
    }
}