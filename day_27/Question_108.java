package day_27;
import java.util.Scanner;
class Student {
    int rollNo;
    String name;
    int m1, m2, m3, m4, m5;
    int total;
    double percentage;
    char grade;
    // Method to input student details
    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Marks of Subject 1: ");
        m1 = sc.nextInt();

        System.out.print("Enter Marks of Subject 2: ");
        m2 = sc.nextInt();

        System.out.print("Enter Marks of Subject 3: ");
        m3 = sc.nextInt();

        System.out.print("Enter Marks of Subject 4: ");
        m4 = sc.nextInt();

        System.out.print("Enter Marks of Subject 5: ");
        m5 = sc.nextInt();
    }
    // Method to calculate result
    void calculate() {
        total = m1 + m2 + m3 + m4 + m5;
        percentage = total / 5.0;

        if (percentage >= 90)
            grade = 'A';
        else if (percentage >= 75)
            grade = 'B';
        else if (percentage >= 60)
            grade = 'C';
        else if (percentage >= 40)
            grade = 'D';
        else
            grade = 'F';
    }
    // Method to display marksheet
    void display() {
        System.out.println("\n----- Marksheet -----");
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("Total Marks : " + total);
        System.out.println("Percentage  : " + percentage + "%");
        System.out.println("Grade       : " + grade);
    }
}
public class MarksheetGeneration {
    public static void main(String[] args) {
        Student s = new Student();

        s.input();
        s.calculate();
        s.display();
    }
}