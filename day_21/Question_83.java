package day_21 ;
import java.util.*;
public class Question_83
{
    public static void main(String args[])
    {
        String str="",strnew="";
        int len;int con=0,vow=0;
        Scanner scnr=new Scanner(System.in);
        System.out.println("Enter a string");
        str=scnr.nextLine();
        len=str.length();
        strnew=str.toUpperCase();
        for(int i=0;i<len;i++)
        {
           if(strnew.charAt(i)=='A'||strnew.charAt(i)=='E'||strnew.charAt(i)=='I'||strnew.charAt(i)=='O'||strnew.charAt(i)=='U') 
           {
               vow++;
           }
           else
           {
               con++;
           }
        }
        System.out.println("STRING: "+strnew);
        System.out.println("NUMBER OF VOWELS: "+vow);
        System.out.println("NUMBER OF CONSONENT: "+con);
    }
}
        
