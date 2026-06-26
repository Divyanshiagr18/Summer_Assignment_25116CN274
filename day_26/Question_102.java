package day_26;
import java.util.*;
public class Question_102
{
 public static void main(String args[])
 {
     Scanner scnr=new Scanner(System.in);
     System.out.println("ENTER THE AGE OF CANDIDATE:");
     int age=scnr.nextInt();
     if(age>=18)
     {
         System.out.println("YOU ARE ELIGIBLE TO VOTE:");     
     }
     else
     {
         System.out.println("YOU ARE NOT ELIGIBLE TO VOTE:");
     }
      }
}