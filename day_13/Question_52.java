import java.util.*;
public class Question_52
{
    public static void main(String args[])
    {
        int odd=0,even=0;
        Scanner scnr=new Scanner (System.in);
        System.out.println("Enter the limit of array");
        int n=scnr.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scnr.nextInt();
        }
        for(int i=0;i<n;i++)
        {
           if(arr[i]%2==0)
           {
               even++;
           }
           else
           {
               odd++;
           }
           
        }
        System.out.println("Number of even element= "+even);
         System.out.println("Number of odd element= "+odd);
    }
}
