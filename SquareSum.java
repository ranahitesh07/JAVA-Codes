import java.util.*;

class SquareThread extends Thread {
    private int num;
    public SquareThread(int num) {
        this.num = num;
    }
    public void run() {
        System.out.println("Square: " + (num * num));
    }
}

class SumThread extends Thread {
    private int num;
    public SumThread(int num) {
        this.num = num;
    }
    public void run() {
        int sum = 0, temp = num;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}

public class SquareSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();

        SquareThread sq = new SquareThread(number);
        SumThread sum = new SumThread(number);

        sq.start();
        sum.start();
    }
}
