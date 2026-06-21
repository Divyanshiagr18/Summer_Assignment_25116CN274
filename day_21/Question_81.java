package day_21 ;
import java.util.*;
public class Question_81
{
    public static void main(String args[])
    {
        String str,str1;int count=0;
        
        Scanner scnr=new Scanner(System.in);
        System.out.println("Enter a string");
        str=scnr.nextLine();
        str1=str+' ';
        str=str.toUpperCase();
       while(str1.charAt(count)!=' ')
       {
           count++;
       }
    System.out.println("Length of string "+str+" : "+count);
}
}