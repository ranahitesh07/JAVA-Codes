class Person {
private String name;
Person(String name) {
this.name = name;
}
void display() {
System.out.println("Name : " + name);
}
}
class Employee extends Person {
private int empid;
Employee(String name, int empid) {
super(name);
this.empid = empid;
}
void display() {
super.display();
System.out.println("EmpID : " + empid);
}
}
class HourlyEmployee extends Employee {
private int hourlyRate;
private int hoursWorked;
HourlyEmployee(String name, int empid, int hourlyRate, int hoursWorked) {
super(name, empid);
this.hourlyRate = hourlyRate;
this.hoursWorked = hoursWorked;
}
int getGrossPay() {
return hourlyRate * hoursWorked;
}
void display() {
super.display();
System.out.println("Hourly Rate : " + hourlyRate);
System.out.println("Hours worked : " + hoursWorked);
System.out.println("Gross pay : " + getGrossPay());
}
}
public class DriverPerson {
public static void main(String[] args) {
HourlyEmployee he = new HourlyEmployee("John Smith", 7569, 100, 2000);
he.display();
}
}