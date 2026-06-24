package day_23;
import java.util.*;
import java.util.Arrays;
public class Question_91
{
    
   
     public static void main(String args[])
    {
        int flag=0;
       Scanner scnr=new Scanner(System.in);
       System.out.println("ENTER TWO STRINGS:");
       String s1=scnr.nextLine();
       String s2=scnr.nextLine();
       s1=s1.toLowerCase();
       s2=s2.toLowerCase();
       char ch1[]= s1.toCharArray();
       char ch2[]= s2.toCharArray();
       int len=s1.length();
       int len2=s2.length();
        Arrays.sort(ch1);
       Arrays.sort(ch2);
       if(len!=len2)
       {
           System.out.println("NOT ANAGRAM STRING:");
       }
       else
       {
          
           for(int i=0;i<=len-1;i++)
           {
               if(ch1[i]!=ch2[i])
               {
                  flag=1; 
                  break;
               }
               else
               {
                   continue;
               }
               
           }
           if(flag==1)
           {
             System.out.println("NOT ANAGRAM STRING:");  
           }
           else
           {
               System.out.println(" ANAGRAM STRING:");
           }
       }
    }
}