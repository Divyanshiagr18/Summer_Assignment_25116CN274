package day3;
import java.util.Scanner;
public class Question_11
{
    public static void main(String args[])
    {
        int a,b,g=0;
        Scanner scnr=new Scanner(System.in);
        System.out.println("enter first number");
        a=scnr.nextInt();
        System.out.println("enter second number");
        b=scnr.nextInt();
        int max=(a>b)?a:b;
        for(int i=1;i<=max;i++)
        {
             if(a%i==0&&b%i==0)
            g=i;
        }
        System.out.println("gcd of "+a+" & "+b+" = "+g);
    }
}
