import java.util.*;
public class Question_36
{
  public static void main(String args[])
  {
      Scanner scnr=new Scanner(System.in);
      System.out.println("Enter number of rows and column");
      int n=scnr.nextInt();
      for(int i=1;i<=n;i++)
      {
      for(int j=1;j<=n;j++)
      {
        if((i==n)||(j==n)||(i==1)||(j==1))  
        System.out.print("*");
        else
        System.out.print(" ");
      }
      System.out.println();
  }
}}