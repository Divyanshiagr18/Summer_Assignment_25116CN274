import java.util.*;
public class Question_40
 {
      public static void main(String[] args)
      {
        Scanner scnr=new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int rows= scnr.nextInt();
        for (int i = 0; i < rows; i++) {
            
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            char ch = 'A';
            for (int k = 0; k <= i; k++) {
                System.out.print((char)('A' + k));
            }
            
            for (int l = i - 1; l >= 0; l--) {
                System.out.print((char)('A' + l));
            }
            System.out.println();
        }
    } 
    
}