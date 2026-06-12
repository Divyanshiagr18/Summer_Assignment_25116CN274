import java.util.Scanner;
public class Question_46
{
    int armstrong(int a)
    {
        int b=a,d=a,c=0,sum=0;
        while(b!=0)
        {
            c++;
            b=b/10;
        }
         while(d!=0)
        {
          int p=d%10;
          sum=sum+(int)Math.pow(p,c);
          d=d/10;
        }
        if (sum==a)
        {
          return 1;
          
        }
        else
        {
            return 0;
          
        }
    }
    
    public void main(String args[])
    {
        Scanner scnr=new Scanner (System.in);
        int n;
        System.out.println("Enter the number to be checked");
        n=scnr.nextInt();
        if(armstrong(n)==1)
        {
         System.out.println("it's an armstrong number") ;   
        }
        else
        {
            System.out.println("it's not an armstrong number") ;
        }
    }
}