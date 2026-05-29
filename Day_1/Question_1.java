// Sum of first N Natural numbvbers : 

package Day_1;

import java.util.Scanner;

public class Question_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms to sum : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1;i<=n;i++){
            sum = sum+i;
        }
        System.out.println("Sum of first N natural Number is : "+ sum);

        sc.close();

    }

}
