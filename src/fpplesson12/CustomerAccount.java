package fpplesson12;

public class CustomerAccount {
 String Cus_name;
 final String Acc_No;
 private double Balance;
 
 
 public CustomerAccount(String Cus_name, String Acc_No,Double Balance) {
	 this.Cus_name = Cus_name;
	 this.Balance = Balance;
	 this.Acc_No = Acc_No;

}


 public void deposit (Double amount) throws MyOwnMadeException 
 {
	 this.Balance += amount;
	 if (this.Balance < 100) throw new MyOwnMadeException ("Current Balance is less than $100");
	
 }
 

 
 public void withdraw(Double amount) throws MyOwnMadeException {
	 if (amount > this.Balance) throw new MyOwnMadeException ("Balance too low to withdraw " + amount);
 }
 
 
 
 class MyOwnMadeException extends Exception {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public MyOwnMadeException() {
			super();
		}
		
		public MyOwnMadeException(String result)
		{
			super();
			System.out.println(result);
		}
 }
 



public static void main(String[] args) throws MyOwnMadeException{
	
	 CustomerAccount customer = new CustomerAccount("Adrine Hinges", "1122332", 90.0);
	 CustomerAccount customer2 = new CustomerAccount("Adrine Solomon", "1122442", 90.0);
	 customer.deposit(1.0);
	 System.out.println();
	 customer2.withdraw(110.0);
	 	 
	 
}




}


