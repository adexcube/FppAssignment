package fpplesson5;


class hourlyEmployee extends Employee
{
	double wage;
	double hours;
	


public hourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
	super(firstName, lastName, socialSecurityNumber);
	this.wage = wage;
	this.hours = hours;
	
	
}

	public double getWage() {
	return wage;
}



public void setWage(double wage) {
	this.wage = wage;
}



public double getHours() {
	return hours;
}



public void setHours(double hours) {
	this.hours = hours;
}



	@Override
	double getPayment()
	{
		return wage * hours;
	}
	
	@Override
	public String toString()
	{
		return "The wage is: " + wage + "\n\n Number of hours: " + hours;
	}
	
}


