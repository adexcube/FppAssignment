package fpplesson3.employeeinfo;



import java.time.LocalDate;
import java.util.GregorianCalendar;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
		this.hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);

	}

	
	public String getName() {
		return name;
	}


	public LocalDate getHireDate() {
		return hireDate;
	}


	public void createNewChecking(double startAmount) {
		// implement
		this.checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
		
	}

	public void createNewSavings(double startAmount) {
		// implement
		this.savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
	}

	public void createNewRetirement(double startAmount) {
		// implement
		this.retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
		
	}

	public String getFormattedAcctInfo() {
		// implement
		
		if (this.checkingAcct == null)
		{
			return "ACCOUNT INFO FOR" + name + "\n" + this.savingsAcct.toString() + this.retirementAcct.toString();
			
		}
		else if (this.savingsAcct == null)
		{
			return "ACCOUNT INFO FOR" + name + "\n" + this.checkingAcct.toString() + this.retirementAcct.toString();
			
		}
		else if (this.retirementAcct == null)
		{
			return "ACCOUNT INFO FOR" + name + "\n" + this.savingsAcct.toString() + this.checkingAcct.toString();
		}
		else 
			return "ACCOUNT INFO FOR" + name + "\n" + this.savingsAcct.toString() + this.retirementAcct.toString() + this.checkingAcct.toString();
		
	
	}
	public void deposit(AccountType acctType, double amt){
		// implement
		switch(acctType)
		{
		case CHECKING:
			this.checkingAcct.makeDeposit(amt);
			break;
		case SAVINGS:
			this.savingsAcct.makeDeposit(amt);
			break;
		case RETIREMENT:
			this.retirementAcct.makeDeposit(amt);
			break;
		default:
			System.out.println("Account not found");
			break;
		
		}
	}
	public boolean withdraw(AccountType acctType, double amt){
		// implement
		boolean flag = false;
		switch(acctType)
		{
		case CHECKING:
			flag = this.checkingAcct.makeWithdrawal(amt);
			return flag;
		case SAVINGS:
			flag = this.savingsAcct.makeWithdrawal(amt);
			return flag;
		case RETIREMENT:
			flag = this.retirementAcct.makeWithdrawal(amt);
			return flag;
		default:
			System.out.println("Account not found");
			return flag;
		
	}
	
		
	}
}
