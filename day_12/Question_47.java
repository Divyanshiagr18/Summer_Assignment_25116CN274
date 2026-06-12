import java.util.*;

public class Question_47
 {
    public static void Fibonacci(int n) 
    {
        System.out.println("FIBONACCI SERIES:");
        int first = 0;
        int second = 1;
        int next;
        
        for (int i = 0; i < n; i++) 
        {
            if (i <= 1) 
            {
                next = i;
            } 
            else 
            {
                next = first + second;
                first = second;
                second = next;
            }
            System.out.print(next + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Fibonacci(n);
       
    }
}   
