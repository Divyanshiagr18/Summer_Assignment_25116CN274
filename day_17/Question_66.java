package day_17 ;
import java.util.Scanner;

public class Question_66 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array:");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) 
        {
            
        arr1[i] = sc.nextInt();
        }
        System.out.println("Enter size of second array:");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) 
        {
            
        arr2[i] = sc.nextInt();
        }
        int[] temp = new int[n1 + n2];
        int count = 0;

        for (int i = 0; i < n1; i++) 
        {
            temp[count++] = arr1[i];
        }

        for (int i = 0; i < n2; i++) 
        {
            boolean exists = false;
            for (int j = 0; j < count; j++) 
            {
                if (arr2[i] == temp[j]) 
                {
                    exists = true;
                    break;
                }
            }
            if (!exists)
            {
                temp[count++] = arr2[i];
            }
        }

        System.out.println("Union of arrays:");
        for (int i = 0; i < count; i++) {
            System.out.print(temp[i] + " ");
        }
        
    }
}   