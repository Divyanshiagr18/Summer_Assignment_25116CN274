package day_15 ;
import java.util.*;
public class Question_60
{
    public static void main(String args[])
    {
        Scanner scnr=new Scanner (System.in);
        int n;String a="",b="",newstr="";
        System.out.println("Enter size of array");
        n=scnr.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements in array");
        for(int i=0;i<n;i++)
        {
            arr[i]=scnr.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                a=a+arr[i]+",";
            }
            else
            {
                b=b+arr[i]+",";
            }
        }
        newstr=a+b;
        System.out.println("Array after moving 0 to end:"+"["+newstr+"]");
    }
}