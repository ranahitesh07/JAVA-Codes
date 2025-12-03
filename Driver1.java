import java.util.Scanner;

class Average {
    double avg(double a, double b, double c) {
        return ((a + b + c) / 3);
    }
}

public class Driver1 {
    public static void main(String[] args) {
        double x, y, z, avrg;
        System.out.print("Enter three numbers: ");
        Scanner sc = new Scanner(System.in);
        Average a1 = new Average();
        x = sc.nextDouble();
        y = sc.nextDouble();
        z = sc.nextDouble();
        avrg = a1.avg(x, y, z);
        System.out.print("Average= " + avrg);
        sc.close();
    }
}

