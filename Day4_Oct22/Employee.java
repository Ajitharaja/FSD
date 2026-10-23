
package Day4_Oct22;

public class Employee {

    int employeeId;
    String name;
    int basicSalary;

    Employee(int employeeId, String name, int basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void calculateSalary() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }

    public static void main(String[] args) {

        PermanentEmployee emp1 = new PermanentEmployee(101, "Aj", 25000);
        ContractEmployee emp2 = new ContractEmployee(102, "san", 18000);
        Employee emp3 = new Employee(103, "re", 4000);

        System.out.println("Permanent Employee Details");
        emp1.calculateSalary();

        System.out.println("\nContract Employee Details");
        emp2.calculateSalary();

        System.out.println("\nEmployee Details");
        emp3.calculateSalary();
    }
}

class PermanentEmployee extends Employee {

    PermanentEmployee(int employeeId, String name, int basicSalary) {
        super(employeeId, name, basicSalary);
    }

    void calculateSalary() {
        double allowance = basicSalary * 0.20;
        double totalSalary = basicSalary + allowance;

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Allowance (20%): " + allowance);
        System.out.println("Total Salary: " + totalSalary);
    }
}

class ContractEmployee extends Employee {

    ContractEmployee(int employeeId, String name, int basicSalary) {
        super(employeeId, name, basicSalary);
    }

    void calculateSalary() {
        int totalSalary = basicSalary + 2000;

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: 2000");
        System.out.println("Total Salary: " + totalSalary);
    }
}
