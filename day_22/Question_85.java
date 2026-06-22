package day_22 ;
import java.util.*;
public class Question_85
{
    public static void main(String args[])
    {
        String str="",newstr="";
        int len;
        Scanner scnr=new Scanner(System.in);
        System.out.println("Enter a string");
        str=scnr.nextLine();
        str=str.toUpperCase();
        len=str.length();
        for(int i=len-1;i>=0;i--)
        {
            newstr=newstr+str.charAt(i);
        }
        if(str.equalsIgnoreCase(newstr))
        {
            System.out.println(str+": ITS PALINDROME");
        }
        else
        {
            System.out.println(str+": ITS NOT PALINDROME");
        }
    }
}