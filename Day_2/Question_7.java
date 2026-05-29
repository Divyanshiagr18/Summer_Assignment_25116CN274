//Find product of digits of given number 

package Day_2;

import java.util.Scanner ;

public class Question_7 {
    public static void main(String[] args){
        System.out.println("Enter the number :");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int product = 1;
        while(n!=0){
            int a = n%10;
            product = a+product;
            n = n/10;
        }
        System.out.print("The product of given number is "+product);
        sc.close();


    }
    
}
