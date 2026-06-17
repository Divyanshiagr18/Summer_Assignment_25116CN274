package day_16 ;
import java.util.*;
public class Question_61 

{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("Enter the number of Elements");
        int num = sc.nextInt();
        int[] arr = new int[num];
        int n = num+1;
        for(i = 0;i<num;i++)
        {
              arr[i]=sc.nextInt();
        }
        int len = arr.length;
        int act_sum=n*(n+1)/2;
        int sum = 0;
        for(i=0;i<len;i++)
        {
            sum+=arr[i];
        }
        int diff = act_sum-sum;
        System.out.println("missing element:"+diff);
       

    }
    
}