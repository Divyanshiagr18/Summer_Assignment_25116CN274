package day_6 ;
import java.util.Scanner;
public class Question_21
{
    public static void main(String args[])
    {
        Scanner scnr= new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int num=scnr.nextInt();
        String b="";
        int t=num;
        while(t>0)
        {
            int rem=t%2;
            b=rem+b;
            t=t/2;
        }
        System.out.println(" Binary Equivalent of "+num+" is= "+ b);
        
    }
}