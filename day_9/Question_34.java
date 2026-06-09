package day_9 ;
import java.util.Scanner;
public class revno
{
    public static void main(String args[])
    {
        int n;
        Scanner scnr=new Scanner (System.in);
        System.out.println("enter no.of rows and column");
        n=scnr.nextInt();
        for(int i=n;i>=1;i--)
        {
            int c=1;
            for (int j=i;j>=1;j--)
            {
                
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
}