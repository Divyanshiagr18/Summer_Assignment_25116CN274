package day_17 ;
import java.util.*;
public class Question_65
 {
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of first array :");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(i = 0;i<n1;i++){
            System.out.println("Enter "+(i+1)+" element of first array");
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter number of elements of Second array :");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(i = 0;i<n2;i++){
            System.out.println("Enter "+(i+1)+" element of second array");
            arr2[i]=sc.nextInt();
        }
        int n3 = n1+n2;
        int[] temp = new int[n3];
        
        for(i=0;i<n1;i++)
        {
            temp[i]=arr1[i];
        }
        for(i=0;i<n2;i++){
            temp[n1+i]=arr2[i];
        
        }
        System.out.println("MERGED ARRAY:");
        for(i=0;i<n3;i++){
            System.out.println((temp[i]));
        }
        
    }
}