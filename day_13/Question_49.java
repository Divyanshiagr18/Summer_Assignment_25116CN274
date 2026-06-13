import java.util.*;
public class Question_49
{
    public static void main(String args[])
    {
        int n;
        Scanner scnr=new Scanner(System.in);
        System.out.println("Enter the limit:");
        n=scnr.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scnr.nextInt();
        }
        System.out.println("Elements of array are :");
        int c=0;
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}