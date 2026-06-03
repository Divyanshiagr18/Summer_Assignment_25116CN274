package day_2;
import java.util.Scanner;
public class Question_8
{
    public static void main(String args[])
    {
        int rev=0,n;
        Scanner scnr=new Scanner(System.in);
        System.out.println("enter a no.");
        n=scnr.nextInt();
        int p=n;
        while(p!=0)
        {
    int r=p%10;
    rev=rev*10+r;
    p=p/10;
    }
    if(rev==n)
    {
    System.out.println("entered no. is palindrome");
    }
    else
    {
     System.out.println("entered no. is not palindrome");
    }
}
}