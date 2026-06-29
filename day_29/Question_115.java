package day_29;
import java.util.Scanner;
public class Question_115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1, str2;
        int choice;
        do {
            System.out.println("\n===== STRING MENU =====");
            System.out.println("1. Find Length");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Convert to Lowercase");
            System.out.println("4. Concatenate Two Strings");
            System.out.println("5. Compare Two Strings");
            System.out.println("6. Reverse String");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    str1 = sc.nextLine();
                    System.out.println("Length = " + str1.length());
                    break;
                case 2:
                    System.out.print("Enter a string: ");
                    str1 = sc.nextLine();
                    System.out.println("Uppercase = " + str1.toUpperCase());
                    break;
                case 3:
                    System.out.print("Enter a string: ");
                    str1 = sc.nextLine();
                    System.out.println("Lowercase = " + str1.toLowerCase());
                    break;
                case 4:
                    System.out.print("Enter first string: ");
                    str1 = sc.nextLine();
                    System.out.print("Enter second string: ");
                    str2 = sc.nextLine();
                    System.out.println("Concatenated String = " + str1.concat(str2));
                    break;
                case 5:
                    System.out.print("Enter first string: ");
                    str1 = sc.nextLine();
                    System.out.print("Enter second string: ");
                    str2 = sc.nextLine();
                    if (str1.equals(str2))
                        System.out.println("Strings are equal.");
                    else
                        System.out.println("Strings are not equal.");
                    break;
                case 6:
                    System.out.print("Enter a string: ");
                    str1 = sc.nextLine();
                    String rev = "";
                    for (int i = str1.length() - 1; i >= 0; i--) {
                        rev += str1.charAt(i);
                    }
                    System.out.println("Reversed String = " + rev);
                    break;
                case 7:
                    System.out.println("Program Exited.");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 7);
    }
}