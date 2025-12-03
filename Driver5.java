import java.util.Scanner;

class Employee {
	int empId;
	String empName;
	String dept;
	double sal;
	
	void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee ID: ");
		empId = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Employee Name: ");
		empName = sc.nextLine();
		System.out.print("Enter Department: ");
		dept = sc.nextLine();
		System.out.print("Enter Salary: ");
		sal = sc.nextDouble();
	}
	void putData() {
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Department: " + dept);
		System.out.println("Salary: " + sal);
	}
}

public class Driver5 {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.getData();
		System.out.println("\nEmployee Details:");
		emp.putData();
	}
}
