package day_2;
import java.util.Scanner;
public class Question_1
{
    public static void main(String args[])
    {
        int n,p,sum=0;int d;
        Scanner scnr=new Scanner(System.in);
        System.out.println("enter a number");
        n=scnr.nextInt();
        p=n;
        while(p!=0)
        {
            d=p%10;
            sum=sum+d;
            p=p/10;
        }
        System.out.println("sum of the digits of the number is:"+sum);
    }
}