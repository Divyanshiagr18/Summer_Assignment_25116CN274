package day_26;
import java.util.Scanner;
public class Question_103
 {
    public static void main(String[] args) 
    {
     Scanner sc = new Scanner(System.in);
     double balance = 10000;
      System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

        while (true)
        {

           
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice)
            {

                case 1:
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("Deposit Successful.");
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= balance) 
                    {
                        balance -= withdraw;
                        System.out.println("Withdrawal Successful.");
                    } else 
                    {
                        System.out.println("Insufficient Balance.");
                    }
                    break;

                case 4:
                    System.out.println("Thank You for using ATM.");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}