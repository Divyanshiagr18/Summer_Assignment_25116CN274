package day_16 ;
import java.util.Scanner;

public class Question_62
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        
        int maxFreqElement = arr[0];
        int maxFreq = 0;


        for (int i = 0; i < n; i++) 
        {
            int currentFreq = 0;
          
            for (int j = 0; j < n; j++) 
            {
                if (arr[i] == arr[j])
                 {
                    currentFreq++;
                }
            }
        
            if (currentFreq > maxFreq || (currentFreq == maxFreq && arr[i] > maxFreqElement)) {
                maxFreq = currentFreq;
                maxFreqElement = arr[i];
            }
        }
        
        System.out.println("Maximum frequency element: " + maxFreqElement);
        
    }
}   