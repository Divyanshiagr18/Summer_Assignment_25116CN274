package day_18 ;
import java.util.*;
public class Question_70
{
public static void main(String args[])
{
    Scanner scnr=new Scanner(System.in);
    int i,j,min,temp;
    System.out.println("Enter size of array");
    int n=scnr.nextInt();
    int a[]=new int[n];
    System.out.println("Enter elements in array:");
    for( i=0;i<n;i++)
    {
        a[i]=scnr.nextInt();
    }
    for(i=0;i<n-1;i++)
    {
        min =i;
        for(j=i+1;j<n;j++)
        {
            if(a[j]<a[min])
            {
                min=j;
            }
            
        }
        temp=a[i];
        a[i]=a[min];
        a[min]=temp;
    }
    System.out.println("SORTED LIST");
    for(i=0;i<n;i++)
    {
        System.out.println(a[i]);
    }
}
}