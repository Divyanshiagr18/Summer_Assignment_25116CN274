package day_28;
import java.util.Scanner;
class Book {
    int bookId;
    String bookName;
    String authorName;
    boolean issued;
    // Method to input book details
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book ID: ");
        bookId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Book Name: ");
        bookName = sc.nextLine();
        System.out.print("Enter Author Name: ");
        authorName = sc.nextLine();
        System.out.print("Is Book Issued? (true/false): ");
        issued = sc.nextBoolean();
    }
    // Method to display book details
    void display() {
        System.out.println("\nBook Details");
        System.out.println("Book ID      : " + bookId);
        System.out.println("Book Name    : " + bookName);
        System.out.println("Author Name  : " + authorName);
        if (issued)
            System.out.println("Status       : Issued");
        else
            System.out.println("Status       : Available");
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Books: ");
        int n = sc.nextInt();
        Book[] b = new Book[n];
        // Input book details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter Details of Book " + (i + 1));
            b[i] = new Book();
            b[i].input();
        }
        // Display all books
        System.out.println("\n----- Library Records -----");
        for (int i = 0; i < n; i++) {
            b[i].display();
        }
    }
}