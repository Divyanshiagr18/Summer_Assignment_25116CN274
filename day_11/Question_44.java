import java.util.Scanner;
public class Question_44
{
    int fact(int y)
    {
        int f=1;
        for(int i=1;i<=y;i++)
        {
            f=f*i;
        }
        return f;
    }
    public  void main (String args[])
    {
        int  n;
        Scanner scnr=new Scanner(System.in);
          System.out.println("enter a number");
          n=scnr.nextInt();
        int a=fact(n);
        System.out.println("factorial of a no."+n+"  is=  "+a);
    }
}