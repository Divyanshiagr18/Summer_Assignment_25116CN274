// Check whether number is palindrome or not ?

package Day_2;

import java.util.Scanner;

public class Question_8 {

    public static void main(String[] args){

        System.out.print("Enter number to check : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int rev = 0;

        while(n!=0){
            int a = n%10;
            rev = rev*10+a;
            n = n/10;

        }
        if(rev==num){
            System.out.println(num+" is palindrome");
        }
        else{
            System.out.println(num+" is not palindrome");
        }
        sc.close();



    }
    
}
