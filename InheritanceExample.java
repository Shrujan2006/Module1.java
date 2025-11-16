// Base class: Employee
class Employee {
    String name;
    double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Derived class: Manager
class Manager extends Employee {
    String department;

    // Constructor
    public Manager(String name, double salary, String department) {
        super(name, salary); // Call superclass constructor
        this.department = department;
    }

    // Override displayInfo to include department
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call superclass method
        System.out.println("Department: " + department);
    }
}

// Main class to test the program
public class InheritanceExample {
    public static void main(String[] args) {
        // Create Manager object
        Manager mgr = new Manager("Shrujan S", 85000.0, "Software Development");

        // Display all details
        System.out.println("Manager Details:");
        mgr.displayInfo();
    }
}