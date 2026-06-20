package day_20 ;
import java.util.*;
public class Question_79
{
    public static void main(String args[])
    {
        int sum=0;
        Scanner scnr=new Scanner(System.in);
        System.out.println("Enter size of row");
        int r=scnr.nextInt();
        System.out.println("enter size of column");
        int c=scnr.nextInt();
        int b=0;
        System.out.println("Enter elements in array:");
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=scnr.nextInt();
            }
        }
        System.out.println("MATRIX:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<r;i++)
        {
            while(b!=c)
            {
                sum+=a[i][b++];
            }
            b=0;
            System.out.println("sum of row "+(i+1)+" -> "+sum);
            sum=0;
        }
        
    }
}