import java.util.Scanner;

class TableThread extends Thread {
    int num;
    TableThread(int num) {
        this.num = num;
    }
    public void run() {
        System.out.println("Multiplication table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

class FactorialThread extends Thread {
    int num;
    FactorialThread(int num) {
        this.num = num;
    }
    public void run() {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " is: " + fact);
    }
}

public class Multiplication {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        TableThread t1 = new TableThread(n);
        FactorialThread t2 = new FactorialThread(n);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
