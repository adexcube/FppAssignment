package fpplesson5;

class salariedEmployee extends Employee{
	double weeklySalary;
	
	
public salariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
	super(firstName, lastName, socialSecurityNumber);
	this.weeklySalary = weeklySalary;
	
	
}


	public double getWeeklySalary() {
	return weeklySalary;
}



public void setWeeklySalary(double weeklySalary) {
	this.weeklySalary = weeklySalary;
}



	@Override
	double getPayment()
	{
		return weeklySalary;
	}
	
	@Override
	public String toString()
	{
		return "The weekly salary is: " + weeklySalary;
	}
	
}
