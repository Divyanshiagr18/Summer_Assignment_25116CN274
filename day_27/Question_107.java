package day_27;
import java.util.Scanner;
class Employee {
    int empId;
    String name;
    double basicSalary, hra, da, netSalary;
    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();
    }
    void calculateSalary() {
        hra = basicSalary * 0.20;   // 20% HRA
        da = basicSalary * 0.10;    // 10% DA
        netSalary = basicSalary + hra + da;
    }
    void display() {
        System.out.println("\nEmployee Salary Details");
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA         : " + hra);
        System.out.println("DA          : " + da);
        System.out.println("Net Salary  : " + netSalary);
    }
}
public class SalaryManagement {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        Employee[] emp = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter Details of Employee " + (i + 1));
            emp[i] = new Employee();
            emp[i].input();
            emp[i].calculateSalary();
        }
        System.out.println("\n----- Salary Report -----");
        for (int i = 0; i < n; i++) {
            emp[i].display();
        }
    }
}