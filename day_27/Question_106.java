package day_27;
import java.util.Scanner;
class Employee {
    int empId;
    String name;
    String department;
    double salary;
     // Method to input employee details
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter Department: ");
        department = sc.nextLine();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }
    // Method to display employee details
    void display() {
        System.out.println("\nEmployee Details");
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : " + salary);
    }
}
public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        Employee[] emp = new Employee[n];
        // Input employee details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter Details of Employee " + (i + 1));
            emp[i] = new Employee();
            emp[i].input();
        }
        // Display employee details
        System.out.println("\n----- Employee Records -----");
        for (int i = 0; i < n; i++) {
            emp[i].display();
        }
    }
}