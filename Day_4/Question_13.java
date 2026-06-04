package Day_4;
import java.util.Scanner;
public class Question_13
{
    public static void main (String args[])
    {
        int first=0,second=1,n,c;
        Scanner scnr=new Scanner(System.in);
        System.out.println("Enter the no. of terms");
        n=scnr.nextInt();
        System.out.print(first+" "+second);
        for(int i=0;i<n;i++)
        {
            c=first+second;
            first=second;
            second=c;
            System.out.print(" "+c+" ");
        }
        
    }
}