package fpplesson5;


class commissionEmployee extends Employee  {
	double grossSales;
	double commissionRate;
	
	public commissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
		
	
	
		public double getGrossSales() {
		return grossSales;
	}



	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}



	public double getCommissionRate() {
		return commissionRate;
	}



	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}



		@Override
		
		double getPayment()
		{
			return (grossSales * (commissionRate/100));
		}
	
		@Override
		
		public String toString()
		{
			return "The gross sales is: " + grossSales + "\n\n The commission rate is: " + commissionRate;
		}
	
	
}
