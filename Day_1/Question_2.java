package Day_1;
import java.util.Scanner;
public class Question_2
{
    public static void main(String args[])
    {
        Scanner scnr=new Scanner(System.in);
        System.out.println("Enter the no:");
        int n=scnr.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"*"+i+"="+(n*i));
            
        }
        
        
    }
}