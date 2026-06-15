package day_15 ;
import java.util.*;
public class Question_57
{
    public static void main(String args[])
    {
        int c=0;
        Scanner scnr=new Scanner (System.in);
        System.out.println("Enter the size of element");
        int n=scnr.nextInt();
        int arr[]=new int[n];
        int newarr[]=new int[n];
        System.out.println("Enter the element in array");
        for(int i=0;i<n;i++)
        {
            arr[i]=scnr.nextInt();
        }
        System.out.println("Elements of array:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        for(int j=n-1;j>=0;j--)
        {
            newarr[c++]=arr[j];
        }
        System.out.println("Reversed array:");
        for(int i=0;i<n;i++)
        {
            System.out.println(newarr[i]);
        }
    }
}