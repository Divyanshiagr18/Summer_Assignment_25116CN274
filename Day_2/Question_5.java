// Find the sum of digits of any number .
package Day_2;
import java.util.Scanner;

public class Question_5{
    public static void main(String[] args){

        System.out.print("Enter the number : ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int num = n;

        while(n!=0){
            int a = n%10;
            n=n/10;
            sum = sum+a;
        }
        System.out.print("Sum of digits of "+num+" is "+sum);
        sc.close();

    }
}