package day_23;
import java.util.*;
public class Question_90
{
    public static void main(String args[])
    {
        int flag=0;char ch=' ';
        Scanner scnr=new Scanner (System.in);
        System.out.println("Enter a string");
        String str =scnr.nextLine();
        str=str.toUpperCase();
        int len=str.length();
        System.out.println("STRING: "+str);
        for(int i=0;i<=len-1;i++)
        {
            ch=str.charAt(i);
             if (str.indexOf(ch) != str.lastIndexOf(ch))
            {
                flag=1;
                break;
        
        }
        
    }
     if(flag==1)
    {
         System.out.println("FIRST REPEATING CHARACTER: "+ch);
    }
    else
    {
         System.out.println("ALL CHARACTERS ARE NON REPEATING: ");
    }
}
}
