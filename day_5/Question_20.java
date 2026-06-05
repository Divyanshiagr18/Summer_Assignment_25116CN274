ackage day_5 ;
import java.util.Scanner;
public class Question_20
{
    int prime(int a)
    {
        int c=0;
         for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            c++;
            else
            continue;
        }
        if(c==2)
        {
          return 1;
        }
        else
        {
           return 0;
        }
    }
    public  void main(String args[])
    {
        int n,pf=0;
        Scanner scnr=new Scanner (System.in);
        System.out.println("Enter a positive integer:");
        n=scnr.nextInt();
       
        for(int i=2;i<=n;i++)
        {
            if((n%i==0)&&(prime(i)==1))
            {
                pf=i;
            }
            else
            {
                continue;
            }
        }
        System.out.println(pf);
    }
}