package Day3_Oct21;
import java.util.Scanner;

public class Inheritance {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        Manager m = new Manager();

	        System.out.print("Enter Name: ");
	        m.name = sc.nextLine();

	        System.out.print("Enter Age: ");
	        m.age = sc.nextInt();

	        System.out.print("Enter Employee ID: ");
	        m.emp_id = sc.nextInt();

	        System.out.print("Enter Salary: ");
	        m.salary = sc.nextDouble();

	        sc.nextLine();

	        System.out.print("Enter Department: ");
	        m.dept = sc.nextLine();

	        System.out.println("\n--- Employee Details ---");
	        m.display();

	        sc.close();
	    }
	}

	class Person {
	    String name;
	    int age;
	}

	class Employee extends Person {
	    int emp_id;
	    double salary;
	}

	class Manager extends Employee {
	    String dept;

	    void display() {
	        System.out.println("Name\t\t: " + name);
	        System.out.println("Age\t\t: " + age);
	        System.out.println("Employee ID\t: " + emp_id);
	        System.out.println("Salary\t\t: " + salary);
	        System.out.println("Department\t: " + dept);
	    }

}
