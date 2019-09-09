package fpplesson3.employeeinfo;



class Account {

	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private Employee employee;
	private AccountType acctType;

	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "AccountType: " + acctType + "\n Current bal: " + balance;
	}

	public void makeDeposit(double deposit) {
		this.balance = this.balance + deposit;

	}

	public boolean makeWithdrawal(double amount) {
		if (amount > this.balance || amount < 1)
		return false;
		else
			this.balance = this.balance - amount;
		return true;
	}

	public double getBalance() {
		return balance;
	}

	public AccountType getAcctType() {
		return acctType;
	}
	
	
}
