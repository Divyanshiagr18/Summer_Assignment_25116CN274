package Day_1;
import java.util.Scanner;
public class Question_1
{
    public static void main(String args[])
    {
        int a,sum=0;
        Scanner scnr=new Scanner(System.in);
        a=scnr.nextInt();
        for(int i=0;i<=a;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}