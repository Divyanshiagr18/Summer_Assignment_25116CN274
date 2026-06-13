import java.util.*;
public class Question_51
{
    public static void main(String args[])
    {
        
        Scanner scnr=new Scanner (System.in);
        System.out.println("Enter the limit of array");
        int n=scnr.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scnr.nextInt();
        }
        int max=arr[0],min=arr[0];
        for(int i=0;i<n;i++)
        {
            if(max<arr[i])
            max=arr[i];
            if(min>arr[i])
            min=arr[i];
            
        }
        System.out.println("max element in the array= "+max);
         System.out.println("min element in the array= "+min);
    }
}