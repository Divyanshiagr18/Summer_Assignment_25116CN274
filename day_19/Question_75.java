package day_19 ;
import java.util.*;
public class Question_75
{
    public static void main(String args[])
    {
        Scanner scnr=new Scanner(System.in);
        int n;
        System.out.println("Enter size of array");
        n=scnr.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("Enter elements in array");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
            arr[i][j]=scnr.nextInt();
          }
        
    }
    System.out.println("The matrix:");
    for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
           System.out.print( arr[i][j]+" ");
        
    }
    System.out.println();
}
System.out.println("Transpose of the matrix:");
     for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
           System.out.print( arr[j][i]+" ");
        
    }
    System.out.println();
}
}
}