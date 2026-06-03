package day3;
import java.util.Scanner;
public class Question_10
{
    int prime(int n)
    {
        int c=0;
      for(int i=1;i<=n;i++)
        {
            if(n%i==0)
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
       int a,b;
        Scanner scnr=new Scanner (System.in);
        System.out.println("enter the range");
        a=scnr.nextInt();
        b=scnr.nextInt();
        System.out.println("prime number between"+a+" & "+b);
        
        
        for(int i=a;i<=b;i++)
        {
            if(prime(i)==1)
            System.out.println(i);
            else continue;
        }
       }
        
     }
       

 