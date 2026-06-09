package day_9 ;
import java.util.Scanner;
public class Question_35
{
    public static void main(String args[])
    {
        int n;
        Scanner scnr=new Scanner (System.in);
        
        for(int i='A';i<='E';i++)
        {
            for (int j='A';j<=i;j++)
            {
                System.out.print((char)i+" ");
            }
            System.out.println();
        }
    }
}