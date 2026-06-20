package day_20 ;
import java.util.*;
public class Question_77 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows of first array:");
        int r1 = sc.nextInt();
        System.out.println("Enter number of columns of first array:");
        int c1 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];

        for(int i = 0; i < r1; i++)
        {
            for(int j = 0; j < c1; j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter number of rows of second array:");
        int r2 = sc.nextInt();
        System.out.println("Enter number of columns of second array:");
        int c2 = sc.nextInt();

        if(c1 != r2)
        {
            System.out.println("Matrices cannot be multiplied.");
            sc.close();
            return;
        }

        int[][] arr2 = new int[r2][c2];
        for(int i = 0; i < r2; i++)
        {
            for(int j = 0; j < c2; j++)
            {
                arr2[i][j] = sc.nextInt();
            }
        }

        int[][] result = new int[r1][c2];
        for(int i = 0; i < r1; i++)
        {
            for(int j = 0; j < c2; j++)
            {
                for(int k = 0; k < c1; k++)
                {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        System.out.println("Product of matrices:");
        for(int i = 0; i < r1; i++)
        {
            for(int j = 0; j < c2; j++)
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }   
    }
}   