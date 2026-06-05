package day_5;
import java.util.Scanner;
public class Question_17
{
    public static void main (String args[])
    {
        int n,sum=0;
        int a;
        Scanner scnr=new Scanner(System.in);
        System.out.println("enter a positive integer:");
        n=scnr.nextInt();
        a=n;
        for(int i=1;i<n;i++)
        {
            if(a%i==0)
            {
                sum=sum+i;
            }
            else
            {
                continue;
            }
        
    }
    if(sum==n)
    {
        System.out.println("its perfect number");
    }
    else
    {
        System.out.println("its not perfect number");
}
}}