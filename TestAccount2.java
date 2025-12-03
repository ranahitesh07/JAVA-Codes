import java.util.Scanner;

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
        System.out.println("Deposited: " + amt + ", Balance: " + balance);
    }

    void withdraw(double amt) throws MinimumBalanceException {
        if (balance - amt < 500) {
            throw new MinimumBalanceException("Balance cannot go below 500");
        }
        balance = balance - amt;
        System.out.println("Withdrawn: " + amt + ", Balance: " + balance);
    }

    void transfer(Account toAccount, double amt) throws MinimumBalanceException {
        if (balance - amt < 500) {
            throw new MinimumBalanceException("Balance cannot go below 500");
        }
        balance = balance - amt;
        toAccount.balance = balance + amt;
        System.out.println("Transferred: " + amt + " to " + toAccount.name);
        System.out.println(this.name + " balance: " + balance);
        System.out.println(toAccount.name + " balance: " + toAccount.balance);
    }
}

public class TestAccount2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name for account 1: ");
        String name1 = sc.nextLine();
        System.out.print("Enter account number for account 1: ");
        int accNo1 = sc.nextInt();
        System.out.print("Enter initial balance for account 1: ");
        double bal1 = sc.nextDouble();
        sc.nextLine();
        Account acc1 = new Account(name1, accNo1, bal1);

        System.out.print("Enter name for account 2: ");
        String name2 = sc.nextLine();
        System.out.print("Enter account number for account 2: ");
        int accNo2 = sc.nextInt();
        System.out.print("Enter initial balance for account 2: ");
        double bal2 = sc.nextDouble();
        Account acc2 = new Account(name2, accNo2, bal2);

        System.out.print("Enter deposit amount for " + acc1.name + ": ");
        acc1.deposit(sc.nextDouble());

        System.out.print("Enter withdraw amount for " + acc1.name + ": ");
        try {
            acc1.withdraw(sc.nextDouble());
        } catch (MinimumBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.print("Enter transfer amount from " + acc1.name + " to " + acc2.name + ": ");
        try {
            acc1.transfer(acc2, sc.nextDouble());
        } catch (MinimumBalanceException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
