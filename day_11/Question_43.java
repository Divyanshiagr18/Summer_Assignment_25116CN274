import java.util.*;
public class Question_43
{
    int check(int a)
    {
        int c=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                c++;
            }
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
        Scanner scnr=new Scanner (System.in);
        System.out.println("Enter the number to be checked");
        int n=scnr.nextInt();
        if(check(n)==1)
        {
            System.out.println("Its a prime number");
        }
        else
        {
            System.out.println("Its not a prime number");
        }
    }
}
