public class Employee {
    int empId;
    String name;
    int deptNo;
    double salary;
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Error: Please provide exactly 4 arguments");
            return;
        }
        Employee emp = new Employee();
        emp.empId = Integer.parseInt(args[0]);
        emp.name = args[1];
        emp.deptNo = Integer.parseInt(args[2]);
        emp.salary = Double.parseDouble(args[3]);
        emp.display();
    }
    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Department Number: " + deptNo);
        System.out.printf("Salary: %.2f%n", salary);
    }
}
