package day_7 ;
import java.util.*;
public class Question_28
{
   static int reverse=0;
    public static void check(int a)
    {
       
        if(a==0)
        {
            return ;
        } 
       int lastdigit=a%10;
       reverse=(reverse*10)+lastdigit;
       check(a/10);
        
           
        
    }
    public void main(String args[])
    {
        Scanner scnr=new Scanner (System.in);
        System.out.println("enter  a positive integer:");
        int n=scnr.nextInt();
        check(n);
        System.out.println(reverse);
    }
    }