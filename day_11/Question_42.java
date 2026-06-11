import java.util.*;
    public class Question_42
    {
    int max(int x,int y)
    {
        if(x>y)
    return x;
    else
    return y;
    }
    public  void main(String args[])
    {
        int n1,n2;
        Scanner scnr=new Scanner (System.in);
        System.out.println("Enter first number:");
        n1=scnr.nextInt();
        System.out.println("Enter second number:");
        n2=scnr.nextInt();
        int result=max(n1,n2);
        System.out.println("max of "+n1+" & "+n2+" = "+result);
    }
}