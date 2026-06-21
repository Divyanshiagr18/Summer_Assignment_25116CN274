package day_21 ;
import java.util.*;
public class Question_82
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
        System.out.println("GIVEN STRING: "+str);
        System.out.println("REVERSED STRING: "+newstr);
    }
}