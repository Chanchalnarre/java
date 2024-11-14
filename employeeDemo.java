import java.util.Scanner;

class Employee {
    private int emp_id;
    private String emp_name;
    private double basic_salary;
    private double gross_salary;

    public Employee(int emp_id, String emp_name, double basic_salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.basic_salary = basic_salary;
        calculateGrossSalary();
    }

    private void calculateGrossSalary() {
        double hra = basic_salary * 0.10; 
        double da = basic_salary * 0.08;  
        double ta = basic_salary * 0.05;  
        gross_salary = basic_salary + hra + da + ta;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Basic Salary: " + basic_salary);
        System.out.println("Gross Salary: " + gross_salary);
    }
}

public class employeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int emp_id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Employee Name: ");
        String emp_name = scanner.nextLine();
        System.out.print("Enter Basic Salary: ");
        double basic_salary = scanner.nextDouble();

        Employee employee = new Employee(emp_id, emp_name, basic_salary);
        
        employee.displayEmployeeDetails();

        scanner.close();
    }
}