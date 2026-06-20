package day_20 ;
import java.util.*;
public class Question_78
    {
    public static void main(String args[])
    {
        Scanner scnr=new Scanner(System.in);
        int flag=0;
        System.out.println("Enter row of matrix");
      int  r1=scnr.nextInt();
        System.out.println("Enter column of matrix");
        int c1=scnr.nextInt();
        int arr[][]=new int[r1][c1];
        System.out.println("Enter elements in array");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
            arr[i][j]=scnr.nextInt();
          }
        
    }
    System.out.println("The matrix:");
    for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
           System.out.print( arr[i][j]+" ");
        
    }
    System.out.println();
    }
     System.out.println("Transpose of the matrix");
     for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
           System.out.print( arr[j][i]+" ");
        
    }
    System.out.println();
}
     for(int i=0;i<r1;i++)
     {
            for(int j=0;j<c1;j++)
            {
          if(arr[i][j]!=arr[j][i])
          {
          flag=1;
          break;
        }
    }
}
    if (flag==0)
    {
    System.out.println("ITS SYMMETRIC");
}
else
{
  System.out.println(" ITS NOT SYMMETRIC");
}
}
}
