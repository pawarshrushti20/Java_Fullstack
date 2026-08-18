package CollectionExample.SetExample;

import java.util.ArrayList;

class Employee {

    int id;
    String name;
    double salary;
    String department;

    Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Salary: " + salary +
                ", Department: " + department;
    }
}

public class Employeeex {

    ArrayList<Employee> employees = new ArrayList<>();


    void addEmployees() {

        employees.add(new Employee(101, "Pooja", 50000, "IT"));
        employees.add(new Employee(102, "Rahul", 60000, "HR"));
        employees.add(new Employee(103, "Amit", 45000, "Finance"));
        employees.add(new Employee(104, "Sneha", 70000, "IT"));
        employees.add(new Employee(105, "Rohan", 40000, "HR"));
    }


    void displayEmployees() {

        System.out.println("----- All Employees -----");

        for (Employee e : employees) {
            System.out.println(e);
        }
    }

  
    void searchById(int id) {

        for (Employee e : employees) {

            if (e.id == id) {
                System.out.println("Employee Found:");
                System.out.println(e);
                return;
            }
        }

        System.out.println("Employee not found.");
    }
 
    void searchByName(String name) {

        for (Employee e : employees) {

            if (e.name.equalsIgnoreCase(name)) {
                System.out.println("Employee Found:");
                System.out.println(e);
                return;
            }
        }

        System.out.println("Employee not found.");
    }


    void updateSalary(int id, double salary) {

        for (Employee e : employees) {

            if (e.id == id) {

                e.salary = salary;

                System.out.println("Salary updated successfully.");
                System.out.println(e);

                return;
            }
        }

        System.out.println("Employee not found.");
    }

    
    void updateDepartment(int id, String department) {

        for (Employee e : employees) {

            if (e.id == id) {

                e.department = department;

                System.out.println("Department updated successfully.");
                System.out.println(e);

                return;
            }
        }

        System.out.println("Employee not found.");
    }

    void deleteEmployee(int id) {

        for (int i = 0; i < employees.size(); i++) {

            if (employees.get(i).id == id) {

                employees.remove(i);

                System.out.println("Employee deleted successfully.");

                return;
            }
        }

        System.out.println("Employee not found.");
    }

    // Find highest paid employee
    void highestPaidEmployee() {

        if (employees.size() == 0) {
            System.out.println("No employees available.");
            return;
        }

        Employee highest = employees.get(0);

        for (Employee e : employees) {

            if (e.salary > highest.salary) {
                highest = e;
            }
        }

        System.out.println("Highest Paid Employee:");
        System.out.println(highest);
    }

    // Find lowest paid employee
    void lowestPaidEmployee() {

        if (employees.size() == 0) {
            System.out.println("No employees available.");
            return;
        }

        Employee lowest = employees.get(0);

        for (Employee e : employees) {

            if (e.salary < lowest.salary) {
                lowest = e;
            }
        }

        System.out.println("Lowest Paid Employee:");
        System.out.println(lowest);
    }

    // Display employees by department
    void displayByDepartment(String department) {

        System.out.println("Employees from " + department + " Department:");

        boolean found = false;

        for (Employee e : employees) {

            if (e.department.equalsIgnoreCase(department)) {

                System.out.println(e);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No employee found in this department.");
        }
    }

    public static void main(String[] args) {

        Employeeex obj = new Employeeex();

        // Add employees
        obj.addEmployees();

        // Display employees
        obj.displayEmployees();

        System.out.println();

        // Search by ID
        obj.searchById(102);

        System.out.println();

        // Search by name
        obj.searchByName("Sneha");

        System.out.println();

        // Update salary
        obj.updateSalary(101, 55000);

        System.out.println();

        // Update department
        obj.updateDepartment(103, "IT");

        System.out.println();

        // Delete employee
        obj.deleteEmployee(105);

        System.out.println();

        // Highest salary
        obj.highestPaidEmployee();

        System.out.println();

        // Lowest salary
        obj.lowestPaidEmployee();

        System.out.println();

        // Display by department
        obj.displayByDepartment("IT");

        System.out.println();

        // Total employees
        System.out.println("Total Employees: " + obj.employees.size());
    }
}