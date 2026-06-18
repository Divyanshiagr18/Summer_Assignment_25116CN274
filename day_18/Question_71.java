package day_18 ;
import java.util.Scanner;

public class Question_71
 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to search:");
        int target = sc.nextInt();

        int low = 0;
        int high = n - 1;
        int foundIndex = -1;

        while (low <= high)
        {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                foundIndex = mid;
                break;
            }
            else if (arr[mid] < target)
            {
                low = mid + 1;
            } else 
            {
                high = mid - 1;
            }
        }

        if (foundIndex != -1) 
        {
            System.out.println("Element found at index: " + foundIndex);
        } else 
        {
            System.out.println("Element not found");
        }
        
        
    }
}   