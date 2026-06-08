package day_8 ;
import java.util.Scanner;
public class Question_29
{
    public static void main(String args[])
    {
        int n;
        Scanner scnr=new Scanner (System.in);
        System.out.println("enter no.of rows and column");
        n=scnr.nextInt();
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}