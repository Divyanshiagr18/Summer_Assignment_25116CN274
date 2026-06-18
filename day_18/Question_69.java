package day_18 ;
import java.util.*;
public class Question_69
{
    public static void main(String args[])
    {
        int temp;
        Scanner scnr=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=scnr.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in array");
        for(int i=0;i<n;i++)
        {
            arr[i]=scnr.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                }
            }
            
        }
        System.out.println("Sorted list:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}