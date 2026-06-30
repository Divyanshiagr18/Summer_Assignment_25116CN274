package day_30;
import java.util.Scanner;
public class Question_117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] name = new String[n];
        String[] course = new String[n];
        int[] roll = new int[n];
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));
            System.out.print("Roll No: ");
            roll[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            name[i] = sc.nextLine();
            System.out.print("Course: ");
            course[i] = sc.nextLine();
            System.out.print("Marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("\n----- Student Records -----");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Roll No : " + roll[i]);
            System.out.println("Name    : " + name[i]);
            System.out.println("Course  : " + course[i]);
            System.out.println("Marks   : " + marks[i]);
            System.out.println("--------------------------");
        }
    }
}