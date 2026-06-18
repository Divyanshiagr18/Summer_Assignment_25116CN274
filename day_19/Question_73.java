package day_19 ;
import java.util.*;
public class Question_73
{
public static void main(String args[])
{
    Scanner scnr=new Scanner(System.in);
    System.out.println("Enter size of array");
   int n=scnr.nextInt();
    int a[]=new int[n];
    int b[]=new int[n];
    int result[]=new int[n];
    System.out.println("Enter element in 1st array:");
    for(int i=0;i<n;i++)
    {
        a[i]=scnr.nextInt();
    }
    System.out.println("Enter element in 2nd array:");
    for(int i=0;i<n;i++)
    {
        b[i]=scnr.nextInt();
    }
    for(int i=0;i<n;i++)
    {
        result[i]=a[i]+b[i];
    }
    System.out.println("Sum of two matrix:");
    for(int i=0;i<n;i++)
    {
        System.out.println(a[i]+" + "+b[i]+" = "+result[i]);
    }
}
}