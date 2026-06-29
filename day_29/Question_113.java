package day_29;
import java.util.*;
public class Question_113
{
    public static void main(String args[])
    {
        Scanner scnr=new Scanner(System.in);
        int choice;
        double num1,num2,result;
        do{
            System.out.println("*-----MENU DRIVEN CALCULATOR-----*");;
            System.out.println("  1. ADDITION   ");
            System.out.println("  2. SUBSTRACTION   "); 
            System.out.println("  3. MULTIPLICATION   ");
            System.out.println("  4. DIVISION   ");
            System.out.println("  5.  EXIT   ");
            System.out.println("ENTER CHOICE:");
            choice=scnr.nextInt();
            switch(choice)
            {
               case 1:
               System.out.print("Enter first number: ");
               num1 = scnr.nextDouble();
               System.out.print("Enter second number: ");
               num2 = scnr.nextDouble();
               result = num1 + num2;
               System.out.println("Addition = " + result);
               break;
               case 2:
               System.out.print("Enter first number: ");
               num1 = scnr.nextDouble();
               System.out.print("Enter second number: ");
               num2 = scnr.nextDouble();
               result = num1 - num2;
               System.out.println("Substraction = " + result);
               break;
               case 3:
               System.out.print("Enter first number: ");
               num1 = scnr.nextDouble();
               System.out.print("Enter second number: ");
               num2 = scnr.nextDouble();
               result = num1 * num2;
               System.out.println("Multiplication = " + result);
               break;
               case 4:
              System.out.print("Enter first number: ");
             num1 = scnr.nextDouble();
             System.out.print("Enter second number: ");
             num2 = scnr.nextDouble();

             if (num2 != 0) {
             result = num1 / num2;
             System.out.println("Division = " + result);
             } else {
              System.out.println("Error! Division by zero is not allowed.");
             }
             break;
             case 5:
            System.out.println("Thank you! Program exited.");
            break;
              default:
             System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }

        } while (choice != 5);
            }
        }
    
