package day_7 ;
import java.util.*;
public class Question_27
{
    int check(int y)
    {
        if(y==0)
        {
            return 0;
        }
        else
        {
        
       
       return (y%10)+check(y/10); 
    }
}
    public  void main(String args[])
    {
        int n,sum=0;
        Scanner scnr=new Scanner (System.in);
        System.out.println("Enter a positive integer");
       n=scnr.nextInt();
       System.out.println("Sum of digit of number "+n+" = "+check(n));
    }
}
