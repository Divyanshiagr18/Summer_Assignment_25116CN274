import java.util.Scanner;
public class Question_3
{
    public static void main (String args[])
    {
        int  f=1,n;
        Scanner scnr=new Scanner(System.in);
          System.out.println("enter a number");
          n=scnr.nextInt();
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("factorial of a no."+n+"  is=  "+f);
    }
}