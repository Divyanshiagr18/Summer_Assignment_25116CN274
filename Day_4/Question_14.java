package Day_4;
import java.util.Scanner;
public class Question_14
{
    public static void main (String args[])
    {
        int first=0,second=1,n,c=0;
        Scanner scnr=new Scanner(System.in);
        System.out.println("Enter the no. of terms");
        n=scnr.nextInt();
       
        for(int i=0;i<n;i++)
        {
            c=first+second;
            first=second;
            second=c;
           
        }
         System.out.print(c);
    }
}