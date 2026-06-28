package day_28;
import java.util.Scanner;
class Ticket {
    int ticketNo;
    String passengerName;
    String destination;
    int seats;
    boolean booked;
    // Method to book ticket
    void bookTicket() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Ticket Number: ");
        ticketNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Passenger Name: ");
        passengerName = sc.nextLine();

        System.out.print("Enter Destination: ");
        destination = sc.nextLine();

        System.out.print("Enter Number of Seats: ");
        seats = sc.nextInt();

        booked = true;

        System.out.println("Ticket Booked Successfully!");
    }
    // Method to cancel ticket
    void cancelTicket() {
        if (booked) {
            booked = false;
            System.out.println("Ticket Cancelled Successfully!");
        } else {
            System.out.println("No Ticket Booked!");
        }
    }
    // Method to display ticket details
    void display() {
        System.out.println("\n----- Ticket Details -----");
        System.out.println("Ticket Number   : " + ticketNo);
        System.out.println("Passenger Name  : " + passengerName);
        System.out.println("Destination     : " + destination);
        System.out.println("Seats           : " + seats);
        if (booked)
            System.out.println("Status          : Booked");
        else
            System.out.println("Status          : Cancelled");
    }
}
public class TicketBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ticket t = new Ticket();
        int choice;
        do {
            System.out.println("\n===== TICKET BOOKING MENU =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Display Ticket");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    t.bookTicket();
                    break;

                case 2:
                    t.cancelTicket();
                    break;

                case 3:
                    t.display();
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