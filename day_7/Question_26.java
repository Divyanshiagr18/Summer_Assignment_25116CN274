package day_7 ;
import java.util.*;
public class Question_26
{
 public static void printfib(int a,int b,int n)
    {
        int c;
        if(n==0)
        {
            return ;
        } 
        else
        
            c=a+b;
            System.out.print(c+" ");
            printfib(b,c,n-1);
        
    }
    public  void main(String args[])
    {
       int a=0,b=1;
    Scanner scnr=new Scanner(System.in);
    System.out.println("enter limit");
    int n=scnr.nextInt();
    System.out.println("FIBONACCI SERIES:");
    System.out.print(a+ " ");
    System.out.print(b+ " ");
    printfib(a,b,n-2);
    }
}