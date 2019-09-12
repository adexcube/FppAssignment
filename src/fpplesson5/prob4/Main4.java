package fpplesson5;

public class Main4 {

	public static void main (String []args) {
		
		Employee[] em = new Employee[5];
		
		em[0] = new commissionEmployee("Daniel", "Kunku", "8767367231", 2000, 20);
		em[1] = new hourlyEmployee("Daniel", "Kunku", "8767367231", 3000,10);
		em[2] = new salariedEmployee("Daniel", "Kunku", "8767367231", 2000);
		em[3] = new salariedEmployee("Daniel", "Kunku", "8767367231", 2000);
		em[4] = new basePlusCommissionEmployee("Daniel", "Kunku", "8767367231", 2000, 1000,9);
		
		
		
		
		double totalSalary = 0;
		for (Employee ob : em)
		{
			totalSalary += ob.getPayment();
		}
		
		System.out.println("The total Salary of all staff is: " + totalSalary);

	}
}
