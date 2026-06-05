package day_5 ;
import java.util.Scanner;
public class Question_19
{
    public static void main(String args[])
    {
        int n;
        Scanner scnr=new Scanner (System.in);
        System.out.println("Enter a positive integer:");
        n=scnr.nextInt();
        System.out.println("factors of number "+n+" are= ");
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
        }
    }
}