package day_26;
import java.util.Scanner;

public class Question_101
 
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter the number");
        int number =scnr.nextInt();
        int guess;

        do {
            System.out.print("Enter your guess: ");
            guess = scnr.nextInt();

            if (guess > number) {
                System.out.println("Too High");
            } else if (guess < number) {
                System.out.println("Too Low");
            } else {
                System.out.println("Correct Guess!");
            }

        } while (guess != number);

        
    }
}