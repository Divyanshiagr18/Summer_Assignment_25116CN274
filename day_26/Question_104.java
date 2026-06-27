package day_26;
import java.util.*;
public class Question_104
{
    public static void main(String args[])
    {
        Scanner scnr=new Scanner(System.in);
        int score=0;
        char ans=' ';
        System.out.println("ALL THE BEST :");
        //Questiion 1
        System.out.println("Q1. Who is known as the Father of Java?");
        System.out.println("a)  James Gosling ");
        System.out.println("b) Dennis Ritchie ");
        System.out.println("c) Bill Gates ");
        System.out.println("d) Elon Musk ");
       System.out.print("Enter your answer: ");
        ans = scnr.next().charAt(0);
        if(ans=='a'||ans=='A')
        {
            score++;
        }
        //Questiion 2
        System.out.println("Q2. Which keyword is used to create an object in Java?");
        System.out.println("a)  object");
        System.out.println("b)  new ");
        System.out.println("c)  create ");
        System.out.println("d)  class ");
       System.out.print("Enter your answer: ");
        ans = scnr.next().charAt(0);
        if(ans=='b'||ans=='B')
        {
            score++;
        }
        //Questiion 3
        System.out.println("Q3. Which of the following is not a programming language?");
        System.out.println("a)  Java");
        System.out.println("b)  Python ");
        System.out.println("c)  HTML ");
        System.out.println("d)  C++ ");
       System.out.print("Enter your answer: ");
        ans = scnr.next().charAt(0);
        if(ans=='c'||ans=='C')
        {
            score++;
        }
        //Questiion 4
        System.out.println("Q4.How many days are there in a leap year?");
        System.out.println("a)  365");
        System.out.println("b)  364 ");
        System.out.println("c)  366");
        System.out.println("d)  367 ");
       System.out.print("Enter your answer: ");
        ans = scnr.next().charAt(0);
        if(ans=='c'||ans=='C')
        {
            score++;
        }
         // Result
        System.out.println("\nYour Score = " + score );

        if (score==4)
            System.out.println("Excellent!");
        else if (score == 3)
            System.out.println("Good Job!");
        else
            System.out.println("Better Luck Next Time!");

    }
}