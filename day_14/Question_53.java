import java.util.Scanner;
public class Question_53
    {
    public static void main(String[] args)
    {
        int n = 0,key=0,f=0,i=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Elements : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter "+(i+1)+" Element : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter key element :");
        key = sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]==key)
            {
               f++;
                break;
            }
        }
        if(f==1)
        {
            System.out.println("Element found in "+i+" index");
        }
        else
        {
            System.out.println("Element not found");
        }
        
    }

}