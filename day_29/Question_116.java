package day_29;
import java.util.Scanner;
public class Question_116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] itemName = new String[100];
        int[] quantity = new int[100];
        double[] price = new double[100];
        int n = 0, choice;
        do {
            System.out.println("\n===== INVENTORY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Item");
            System.out.println("2. Display Items");
            System.out.println("3. Search Item");
            System.out.println("4. Update Quantity");
            System.out.println("5. Delete Item");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Item Name: ");
                    itemName[n] = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    quantity[n] = sc.nextInt();
                    System.out.print("Enter Price: ");
                    price[n] = sc.nextDouble();
                    n++;
                    System.out.println("Item Added Successfully.");
                    break;
                case 2:
                    if (n == 0) {
                        System.out.println("Inventory is Empty.");
                    } else {
                        System.out.println("\nItem\tQuantity\tPrice");
                        for (int i = 0; i < n; i++) {
                            System.out.println(itemName[i] + "\t" + quantity[i] + "\t\t" + price[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Item Name to Search: ");
                    String search = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < n; i++) {
                        if (itemName[i].equalsIgnoreCase(search)) {
                            System.out.println("Item Found");
                            System.out.println("Name: " + itemName[i]);
                            System.out.println("Quantity: " + quantity[i]);
                            System.out.println("Price: " + price[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Item Not Found.");
                    break;
                case 4:
                    System.out.print("Enter Item Name to Update: ");
                    String update = sc.nextLine();
                    found = false;
                    for (int i = 0; i < n; i++) {
                        if (itemName[i].equalsIgnoreCase(update)) {
                            System.out.print("Enter New Quantity: ");
                            quantity[i] = sc.nextInt();
                            System.out.println("Quantity Updated.");
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Item Not Found.");
                    break;
                case 5:
                    System.out.print("Enter Item Name to Delete: ");
                    String delete = sc.nextLine();
               found = false;
                    for (int i = 0; i < n; i++) {
                        if (itemName[i].equalsIgnoreCase(delete)) {
                            for (int j = i; j < n - 1; j++) {
                                itemName[j] = itemName[j + 1];
                                quantity[j] = quantity[j + 1];
                                price[j] = price[j + 1];
                            }
                            n--;
                            found = true;
                            System.out.println("Item Deleted Successfully.");
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Item Not Found.");
                    break;
                case 6:
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        } while (choice != 6);
    }
}