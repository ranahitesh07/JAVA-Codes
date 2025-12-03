import java.util.*;

class ArmstrongChecker implements Runnable {
    private int number;
    public ArmstrongChecker(int number) {
        this.number = number;
    }
    public void run() {
        int temp = number, sum = 0, digits = 0;
        int numCopy = number;
        while (numCopy != 0) {
            digits++;
            numCopy /= 10;
        }
        numCopy = number;
        while (numCopy != 0) {
            int rem = numCopy % 10;
            sum += Math.pow(rem, digits);
            numCopy /= 10;
        }
        if (sum == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}

public class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Runnable r = new ArmstrongChecker(num);
        Thread t = new Thread(r);
        t.start();
    }
}
