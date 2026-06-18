package day_19 ;
import java.util.*;
public class Question_76
{
    public static void main(String args[])
    {
        int sum=0;
        Scanner scnr=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=scnr.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=scnr.nextInt();
            }
        }
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                sum=sum+arr[i][j];
                else
                continue;
            }
        }
        System.out.println("THE MATRIX:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("SUM OF DIAGONAL MATRIX:"+sum);
    }
}