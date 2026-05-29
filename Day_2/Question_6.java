// To reverse the given number 

package Day_2;

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args){

        System.out.print("Enter the number to reverse : ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int rev=0;

        while(n!=0){
            int a = n%10;
            rev = rev*10+a;
            n = n/10;
            
        }
        System.out.print("Reversed number is : "+rev);
        sc.close();

    }

    
}
