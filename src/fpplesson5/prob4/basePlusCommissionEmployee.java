package fpplesson5;

class basePlusCommissionEmployee extends commissionEmployee {
	double baseSalary;
	
	
	public basePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary){
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	
	}
	
	
	public double getBaseSalary() {
		return baseSalary;
	}



	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}



	@Override
	double getPayment()
	{
		return baseSalary + (grossSales * (commissionRate/100));
	}
	
	@Override
	
	public String toString()
	{
		return "The base salary is:" + baseSalary;
				
	}
}


