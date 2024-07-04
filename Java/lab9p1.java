/*1. Write a Java Program to define a class Employee with data members as empid, basic
DA which are taken from user and a method as salary which adds basic with DA and
prints total along-with empid. Derive a class Manager with a data member tallowance
which is calculated as 10% of basic. And also override the method salary which adds
basic, DA, tallowance and prints total along-with empid. Write the complete program
to check method overriding.*/


import java.util.Scanner;


class Employee {
    protected int empid;
    protected double basic;
    protected double DA;

    // Constructor to initialize empid, basic, and DA
    public Employee(int empid, double basic, double DA) {
        this.empid = empid;
        this.basic = basic;
        this.DA = DA;
    }

    // Method to calculate salary
    public void salary() {
        double totalSalary = basic + DA;
        System.out.println("Employee ID: " + empid);
        System.out.println("Total Salary: " + totalSalary);
    }
}


class Manager extends Employee {
    protected double tallowance;

    // Constructor to initialize empid, basic, DA, and tallowance
    public Manager(int empid, double basic, double DA) {
        super(empid, basic, DA);
        this.tallowance = 0.1 * basic;
    }

    // Method overriding to calculate salary
    @Override
    public void salary() {
        double totalSalary = basic + DA + tallowance;
        System.out.println("Manager ID: " + empid);
        System.out.println("Total Salary: " + totalSalary);
    }
}

// Main class to test the classes
public class lab9p1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creating an object of Employee
        System.out.print("Enter Employee ID: ");
        int empid = input.nextInt();
        System.out.print("Enter Basic Salary: ");
        double basic = input.nextDouble();
        System.out.print("Enter DA: ");
        double DA = input.nextDouble();

        Employee employee = new Employee(empid, basic, DA);
        employee.salary();

    
        System.out.print("Enter Manager ID: ");
        empid = input.nextInt();
        System.out.print("Enter Basic Salary: ");
        basic = input.nextDouble();
        System.out.print("Enter DA: ");
        DA = input.nextDouble();

        Manager manager = new Manager(empid, basic, DA);
        manager.salary();
    }
}
 