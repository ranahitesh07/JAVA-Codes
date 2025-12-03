class Account {
	String customerName;
	String accountNumber;
	
	Account(String customerName, String accountNumber) {
		this.customerName = customerName;
		this.accountNumber = accountNumber;
	}
	
	void display() {
		System.out.println("Customer Name: " + customerName);
		System.out.println("Account Number: " + accountNumber);
	}
}

class Savings_Account extends Account {
	double min_bal;
	double saving_bal;
	
	Savings_Account(String customerName, String accountNumber, double min_bal, double saving_bal) {
		super(customerName, accountNumber);
		this.min_bal = min_bal;
		this.saving_bal = saving_bal;
	}
	
	void show() {
		display();
		System.out.println("Minimum Balance: " + min_bal);
		System.out.println("Savings Balance: " + saving_bal);
	}
}

class Account_details extends Savings_Account {
	double deposit;
	double withdrawal;
	
	Account_details(String customerName, String accountNumber, double min_bal, double saving_bal, double deposit, double withdrawal) {
		super(customerName, accountNumber, min_bal, saving_bal);
		this.deposit = deposit;
		this.withdrawal = withdrawal;
	}
	
	void show1() {
		show();
		System.out.println("Deposit: " + deposit);
		System.out.println("Withdrawal: " + withdrawal);
		double currentBalance = saving_bal + deposit - withdrawal;
		System.out.println("Current Balance: " + currentBalance);
	}
}

public class DriverAccount {
	public static void main(String[] args) {
		Account_details customer = new Account_details("Hitesh Rana", "ACC123456", 1000.00, 5000.00, 1500.00, 3000.00);
		customer.show1();
		}
}
