package Day_4;
import java.util.*;
public class Question_16
{
    
    int check(int p)
    {
        int a=p,b=p;
        double sum=0.0;
       int count=0;
       while(a!=0)
       {
        count++;
        a=a/10;
       }
       while(b!=0)
       {
           int d=b%10;
           sum=sum+Math.pow(d,count);
           b=b/10;
       }
       if(sum==p)
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
        int start,end;
        double sum=0.0;
        Scanner scnr=new Scanner(System.in);
        System.out.println("start:");
        start=scnr.nextInt();
         System.out.println("end:");
        end=scnr.nextInt();
        System.out.println("armstroong no. in range "+start+" & " +end+" are = ");
        
        for(int i=start;i<=end;i++)
        {
            if(check(i)==1)
            {
                System.out.println(i);
            }
            else continue;
        }
        
    }
}

        