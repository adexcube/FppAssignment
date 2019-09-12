package fpplesson5;

import java.time.LocalDate;

public class DeptEmployee {
	String name;
	double salary;
	LocalDate hire_date;
	
	DeptEmployee(String name, double salary, LocalDate hire_date) {
		this.name = name;
		this.salary = salary;
		this.hire_date = hire_date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getHire_date() {
		return hire_date;
	}

	public void setHire_date(LocalDate hire_date) {
		this.hire_date = hire_date;
	}
	
	
	double computeSalary()
	{
		return salary;
	}
	
}
	
	 class Professor extends DeptEmployee
	{
		 int numberOfPublications;

		Professor(String name, double salary, LocalDate hire_date, int numberOfPublications) 
		{
			super(name, salary, hire_date);
			this.numberOfPublications = numberOfPublications;
			
		}

		public int getNumberOfPublications() {
			return numberOfPublications;
		}

		public void setNumberOfPublications(int numberOfPublications) {
			this.numberOfPublications = numberOfPublications;
		}
		
		
		
	}
	 
	 
	 class Secretary extends DeptEmployee
	 {
		 double overtimeHours;
		 
		 public Secretary(String name, double salary, LocalDate hire_date, double overtimeHours) 
		 {
			 super(name, salary, hire_date);
			 this.overtimeHours = overtimeHours;
		}

		public double getOvertimeHours() {
			return overtimeHours;
		}

		public void setOvertimeHours(double overtimeHours) {
			this.overtimeHours = overtimeHours;
		}
		 
	
		double computeSalary()
		{
			return salary + (12 * overtimeHours);
		}
		 
	 }


