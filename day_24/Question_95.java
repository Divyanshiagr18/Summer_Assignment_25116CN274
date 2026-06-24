package day_24;
import java.util.Scanner;

public class Question_95
{
    static String longestWord(String str) 
    {
        String[] words = str.split(" ");
        String longest = words[0];

        for (int i = 1; i < words.length; i++) 
        {
            if (words[i].length() > longest.length()) 
            {
                longest = words[i];
            }
        }

        return longest;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String s = sc.nextLine();

        System.out.println("Longest word: " + longestWord(s));
    }
}