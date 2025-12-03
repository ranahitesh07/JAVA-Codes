import java.util.*;

class MinimumBalanceException extends Exception {
    public MinimumBalanceException(String msg) {
        super(msg);
    }
}

class Account {
    String name;
    int acc_no;
    double balance;

    Account(String name, int acc_no, double balance) {
        this.name = name;
        this.acc_no = acc_no;
        this.balance = balance;
    }

    void deposit(double amt) {
        balance = balance + amt;
        System.out.println("Balance: " + balance);
    }

    void withdraw(double amt) throws MinimumBalanceException {
        if (balance - amt < 500) {
            throw new MinimumBalanceException("Balance cannot go below 500");
        }
        balance = balance - amt;
        System.out.println("Balance: " + balance);
    }
}

public class TestAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Acc No: ");
        int accno = sc.nextInt();

        System.out.print("Initial Balance: ");
        double bal = sc.nextDouble();

        Account acc = new Account(name, accno, bal);

        System.out.print("Deposit amount: ");
        acc.deposit(sc.nextDouble());

        System.out.print("Withdraw amount: ");
        try {
            acc.withdraw(sc.nextDouble());
        } catch (MinimumBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
