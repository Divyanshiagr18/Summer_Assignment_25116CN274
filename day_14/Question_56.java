import java.util.Scanner;

public class Question_56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Elements :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            System.out.println("Enter " + (i + 1) + " Element");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Duplicate Element :");
        boolean found = false;
        
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    found = true;
                    break;
                }
            }
        }
        
        if(!found){
            System.out.println("No duplicates found");
        }
        
    }
}   