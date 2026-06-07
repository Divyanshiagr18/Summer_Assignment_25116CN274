package day_6 ;
import java.util.Scanner;
public class Question_24
{
    public static void main(String args[])
    {
        int b,p,result=1;
        Scanner scnr=new Scanner(System.in);
        System.out.println("Enter the base:");
        b=scnr.nextInt();
        System.out.println("Enter the power:");
        p=scnr.nextInt();
        for(int i=1;i<=p;i++)
        {
           result=result*b; 
        }
        System.out.println(result);
    }
}