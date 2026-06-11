import java.util.*;
public class Question_41
{
    int sum(int x,int y)
    {
        int z=x+y;
        return z;
    }
    public  void main(String args[])
    {
        int n1,n2;
        Scanner scnr=new Scanner (System.in);
        System.out.println("Enter first number:");
        n1=scnr.nextInt();
        System.out.println("Enter second number:");
        n2=scnr.nextInt();
        int result=sum(n1,n2);
        System.out.println("Sum of "+n1+" & "+n2+" = "+result);
    }
}