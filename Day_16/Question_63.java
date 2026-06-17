package day_16 ;
import java.util.Scanner;

public class Question_63 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target sum:");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n ; i++)
        {
            for (int j = i ; j < n; j++) 
            {
                if (arr[i] + arr[j] == target) 
                {
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                    found = true;
                   
                }
            }
        }

        if (!found)
        
        {
            System.out.println("No pair found with the given sum.");
        }

        
    }
}   