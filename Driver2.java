import java.util.Scanner;

class Student {
	String name;
	int roll;
	String branch;

void details() {
	System.out.println("Enter the details of the student: ");
	Scanner sc = new Scanner(System.in);
	name = sc.nextLine();
	branch = sc.nextLine();
	roll = sc.nextInt();
	sc.close();
	}
	void show() {
		System.out.println("The name of the student is " + name + ", Branch is " + branch + ", Rollno." + roll);
	}
}

public class Driver2 {
	public static void main(String[] args) {
		Student s = new Student();
		s.details();
		s.show();
	}
}
