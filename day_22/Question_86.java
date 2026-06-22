package day_22 ;
import java.util.*;
public class Question_86
{
    public static void main(String args[])
    {
        int c=0;
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
                c++;
            }
        }
        System.out.println(str);
        System.out.println("NO. OF WORDS IN THE SENTENCE ARE:"+c);
    }
}