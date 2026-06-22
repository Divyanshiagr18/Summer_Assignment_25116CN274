package day_22 ;
import java.util.*;
public class Question_88
{
    public static void main(String args[])
    {
        String newstr="";
        Scanner scnr=new Scanner(System.in);
        System.out.println("ENTER A SENTENCE:");
        String str=scnr.nextLine();
        str=str.trim();
        str=str+" ";
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            if(str.charAt(i)==' ')
            {
                continue;
            }
            else
            {
                newstr=newstr+str.charAt(i);
            }
        }
        System.out.println("STRING : "+str);
        System.out.println("STRING AFTER REMOVING SPACES:  "+newstr);
    }
}