package day_25;
import java.util.*;
import java.util.Arrays;
public class Question_97
{
    public static void main(String args[])
    {
        
            Scanner scnr=new Scanner(System.in);
            System.out.println("ENTER SIZE OF FIRST ARRAY:");
            int n1=scnr.nextInt();
            System.out.println("ENTER ELEMENT IN FIRST ARRAY:");
            int a1[]= new int[n1];
            for(int i=0;i<n1;i++)
            {
                a1[i]=scnr.nextInt();
            }
            System.out.println("ENTER SIZE OF SECOND ARRAY:");
            int n2=scnr.nextInt();
            System.out.println("ENTER ELEMENT IN SECOND ARRAY:");
            int a2[]= new int[n2];
            for(int i=0;i<n2;i++)
            {
                a2[i]=scnr.nextInt();
            }
            int a3[]=new int[n1+n2];
            Arrays.sort(a1);
            Arrays.sort(a2);
            for(int i=0;i<n1;i++)
            {
                a3[i]=a1[i];
            }
            int c=n1;
            for(int i=0;i<(n2);i++)
            {
               a3[c+i]=a2[i];
            }
            Arrays.sort(a3);
            System.out.println("MERGED ARRAY:");
            for(int i=0;i<(n1+n2);i++)
            {
                System.out.println(a3[i]);
            }
    }
}