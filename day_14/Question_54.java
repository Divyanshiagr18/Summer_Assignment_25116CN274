import java.util.*;
public class Question_54
{
    public static void main (String args[])
    {
        int n,c =0;
        Scanner scnr=new Scanner(System.in);
        System.out.println("Enter the no. of element:");
        n=scnr.nextInt();
        System.out.println("Enter the elements in array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
           arr[i]=scnr.nextInt(); 
        }
        System.out.println("Enter key element");
           int key=scnr.nextInt();
           for(int i=0;i<n;i++)
           {
               if(arr[i]==key)
               c++;
               else
               continue;
               
           }
           System.out.println("Frequency of "+key+" = "+c);
    }
}
