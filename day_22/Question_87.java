package day_22 ;
import java.util.*;
public class Question_87
{
    public static void main(String args[])
    {
        int c=0;
        Scanner scnr=new Scanner (System.in);
        System.out.println("ENTER A SENTENCE:");
        String str= scnr.nextLine();
        str=str.toUpperCase();
        str=str+" ";
        System.out.println("ENTER A CHARACTER IN CAPITAL LETTER:");
        char ch = scnr.next().charAt(0);
        int len=str.length();
        for(int i=0;i<len-1;i++ )
        {
            if(str.charAt(i)==ch)
            {
                c++;
            }
            else
            continue;
        }
        System.out.println("FREQUENCY OF "+ch+" = "+c);
    }
}