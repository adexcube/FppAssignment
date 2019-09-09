package fpplesson3;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Employee employee = new Employee("Daniel","solo",2000,2010,11,23);
			
			Account checking = new Account (employee, AccountType.CHECKING, 300);
			Account savings = new Account (employee, AccountType.SAVINGS, 300);
			Account retirement = new Account (employee, AccountType.RETIREMENT, 300);
			
			
			checking.makeDeposit(300);
			savings.makeDeposit(300);
			retirement.makeDeposit(300);
			checking.makeWithdrawal(300);
			savings.makeWithdrawal(300);
			retirement.makeWithdrawal(300);
			
			
			System.out.println(checking.toString() +"\n" + savings.toString() +"\n" + retirement.toString());
			
			
			
	}

}
