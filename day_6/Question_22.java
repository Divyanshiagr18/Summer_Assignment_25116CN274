package day_6 ;
import java.util.Scanner;
public class Question_22
{
    public static void main(String args[])
    {
        Scanner scnr= new Scanner(System.in);
        System.out.println("Enter a binary number");
        int num=scnr.nextInt();
        int d=0,i=0,t;
        t=num;
        
        while(t>0)
        {
            int r=t%10;
            d=d+r*(int)Math.pow(2,i++);
            t=t/10;
        }
        System.out.println(" decimal equivalent of "+num+" is "+d);
    }
}