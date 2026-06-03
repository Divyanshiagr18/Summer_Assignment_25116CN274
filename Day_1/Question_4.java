package Day_1;
import java.util.Scanner;
public class Question_4
{
    public static void main(String args[])
    {
        int count=0 ,n,p;
        Scanner scnr=new Scanner(System.in);
        System.out.println("Enter a number");
        n=scnr.nextInt();
        p=n;
        while(p!=0)
        {
            count++;
           p=p/10;
           
        }
        System.out.println("no of digits in "+n+ " are"+count);
        
    }
}