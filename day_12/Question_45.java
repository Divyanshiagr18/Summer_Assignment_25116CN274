import java.util.*;
public class Question_45
{
    int palin(int a)
    {
        int b=a,rev=0;
         while(b!=0)
        {
    int r=b%10;
    rev=rev*10+r;
    b=b/10;
    }
    if(rev==a)
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
        int n;
        Scanner scnr=new Scanner (System.in);
        System.out.println("Enter a positive integer");
        n=scnr.nextInt();
        if(palin(n)==1)
        {
         System.out.println("entered no. is palindrome");
       }
        else
        {
         System.out.println("entered no. is not palindrome");
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
    }
}