package day3;
import java.util.Scanner;
public class Question_12
{
    public static void main(String args[])
    {
        Scanner scnr=new Scanner (System.in);
        int a,b,g=0;
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
        int lcm=(a*b)/g;
        System.out.println("LCM of"+a+" & "+b+" = "+lcm);
    }
}