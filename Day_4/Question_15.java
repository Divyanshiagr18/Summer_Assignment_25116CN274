package Day_4;
import java.util.*;
public class Question_15
{
    int count(int a)
    {
        int c=0;
        while (a!=0)
        {
            c++;
            a=a/10;
        }
        return c;
    }
    public  void main(String args[])
    {
        int n;
        double sum=0.0;
        Scanner scnr=new Scanner(System.in);
        System.out.println("enter the no.  ");
        n=scnr.nextInt();
        int d=n;
        int digit=count(n);
        while(d!=0)
        {
          int p=d%10;
          sum=sum+Math.pow(p,digit);
          d=d/10;
        }
        if (sum==n)
        {
          System.out.println("it's an armstrong number") ;
          
        }
        else
        {
            System.out.println("its not an armstong number") ;
          
        }
    }
    
}