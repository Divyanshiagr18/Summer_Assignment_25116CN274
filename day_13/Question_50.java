import java.util.*;
public class Question_50
{
    public static void main(String args[])
    {
        int sum=0;
        double avg;
        Scanner scnr=new Scanner(System.in);
        System.out.println("enter the limit");
       int  n=scnr.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scnr.nextInt();
        }
        System.out.println("Elements of array are:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
            sum=sum+arr[i];
        }
        avg=(double)sum/n;
        System.out.println("Sum of the elements of array ="+sum);
         System.out.println("Average of the elements of array ="+avg);
    }
    }