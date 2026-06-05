package day_5 ;
import java.util.*;
public class Question_18
{
    int factorial(int a)
    {
        int f=1;
        for(int i=1;i<=a;i++)
        {
           f=f*i; 
        }
        return f;
    }
    public  void main()
    {
        int n,sum=0;
        Scanner scnr=new Scanner (System.in);
        System.out.println("enter a positive integer:");
        n=scnr.nextInt();
        int b=n;
        while(b!=0)
        {
            int d=b%10;
            sum=sum+factorial(d);
            b=b/10;
        }
        if(sum==n)
        {
            System.out.println("it's a strong number");
        }
        else
        {
            System.out.println("it's not a strong number");
        }
}
}
