import java.util.*;

class Student {
	int regNo;
	String stdName;
	String branch;
	double CGPA;
	
	void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Register Number: ");
		regNo = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Student Name: ");
		stdName = sc.nextLine();
		System.out.print("Enter Branch: ");
		branch = sc.nextLine();
		System.out.print("Enter CGPA: ");
		CGPA = sc.nextDouble();
	}
	
	void putData() {
		System.out.println("Register Number: " + regNo);
		System.out.println("Student Name: " + stdName);
		System.out.println("Branch: " + branch);
		System.out.println("CGPA: " + CGPA);
	}
}

public class DriverStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] students = new Student[5];  //have to write 50
		System.out.println("Enter details of 5 students:"); //have to write 50
		for (int i = 0; i < 5; i++) { //have to write 50
			students[i] = new Student();
			System.out.println("\nEnter details for Student " + (i + 1) + ":");
			students[i].getData();
		}
		double maxCGPA = students[0].CGPA;
		int pos = 0;
		for (int i = 1; i < 5; i++) {  //have to write 50
			if (students[i].CGPA > maxCGPA) {
				maxCGPA = students[i].CGPA;
				pos = i;
			}
		}
		System.out.println("\nStudent with Highest CGPA:");
		students[pos].putData();
	}
}
