package day_8 ;
import java.util.Scanner;
public class Question_33
{
    public static void main(String args[])
    {
        int n;
        Scanner scnr=new Scanner (System.in);
        System.out.println("enter no.of rows and column");
        n=scnr.nextInt();
        for(int i=n;i>=1;i--)
        {
            for (int j=i;j>=1;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}