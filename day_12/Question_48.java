import java.util.*;
public class Question_48
{
    int perfect(int a)
    {
        int b=a,sum=0;
        for(int i=1;i<b;i++)
        {
            if(b%i==0)
            {
            sum=sum+i;
            }
            else
            {
                continue;
            }
         }
        if(sum==a)
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
        Scanner scnr=new Scanner (System.in);
        int n=scnr.nextInt();
        if(perfect(n)==1)
        {
            System.out.println("its perfect number:");
        }
        else
        {
            System.out.println("Its not a perfect number:");
        }
    }
}