package day_7 ;
import java.util.*;
public class Question_25
 {
    
    public static int fact(int x){
        if(x==1||x==0)
        {
            return 1;
        }
        else
        {
            return x*fact(x-1);
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("factorial of the number= "+fact(n));

    }
    
    
}
