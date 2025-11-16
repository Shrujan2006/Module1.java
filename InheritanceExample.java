
class Employee {
    String name;
    double salary;

    
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}


class Manager extends Employee {
    String department;


    public Manager(String name, double salary, String department) {
        super(name, salary); // Call superclass constructor
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call superclass method
        System.out.println("Department: " + department);
    }
}


public class InheritanceExample {
    public static void main(String[] args) {
 
        Manager mgr = new Manager("Shrujan S", 85000.0, "Software Development");

     
        System.out.println("Manager Details:");
        mgr.displayInfo();
    }

}
