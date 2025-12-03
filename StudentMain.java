import btech.Student;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll no: ");
        int rollNo = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter 3 sub mark: ");
        int[] marks = new int[3];
        for (int i = 0; i < 3; i++) {
            marks[i] = sc.nextInt();
        }

        Student st = new Student(rollNo, name, marks);

        st.display();
        System.out.println("Total = " + st.getTotal());
        System.out.println("percentage = " + st.getPercentage());
    }
}
