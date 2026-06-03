package day_2;
import java.util.Scanner;
public class Question_7
{
    public static void main(String args[])
    {
        int p=1,n;
        Scanner scnr=new Scanner(System.in);
        System.out.println("enter a no");
        n=scnr.nextInt();
        int d=n;
        while(d!=0)
        {
            int a=d%10;
            p=p*a;
            d=d/10;
        }
        System.out.println("product of digits is"+p);
    }
}