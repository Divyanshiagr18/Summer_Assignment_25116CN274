package day_30;
import java.util.Scanner;
public class Question_118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] bookName = new String[n];
        String[] author = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Book " + (i + 1));

            System.out.print("Book Name: ");
            bookName[i] = sc.nextLine();

            System.out.print("Author Name: ");
            author[i] = sc.nextLine();
        }
        System.out.println("\n----- Library Books -----");
        for (int i = 0; i < n; i++) {
            System.out.println("Book Name : " + bookName[i]);
            System.out.println("Author    : " + author[i]);
            System.out.println("-------------------------");
        }
        System.out.print("\nEnter book name to search: ");
        String search = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (bookName[i].equalsIgnoreCase(search)) {
                System.out.println("\nBook Found!");
                System.out.println("Book Name : " + bookName[i]);
                System.out.println("Author    : " + author[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not available in library.");
        }
    }
}