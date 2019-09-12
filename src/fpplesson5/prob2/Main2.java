package fpplesson5;

import java.time.LocalDate;
import java.util.Scanner;

public class Main2 {

	public static void main(String args[]) {
		DeptEmployee [] employee = new DeptEmployee[5];	
		employee[0] = new Professor("Daniel Solomon", 3000, LocalDate.now(), 10);
		employee[1] = new Professor("Solomon Alvin", 4000, LocalDate.now(), 6);
		employee[2] = new Professor("Alkinson Joshua", 2000, LocalDate.now(), 4);
		employee[3] = new Secretary("Godwin Hushman", 4000, LocalDate.now(), 12);
		employee[4] = new Secretary("Victor Sickler", 5000, LocalDate.now(), 12);
		
		
	Scanner sc = new Scanner(System.in);
	System.out.println ("Will you like to see thw salary of all the employees(professors and secretary)? Enter Y for Yes and N for No: ");
	String value = sc.nextLine();
	 double totalComputeSalary = 0;
	if (value.equals("Y"))
	{
		for (DeptEmployee em : employee)
		{
			
				totalComputeSalary += em.computeSalary();
				
		
			}
			System.out.print("The total compute salary is: " + totalComputeSalary);

				
		}
		
		//System.out.println("Sum of all professors and secretary salary is " + totalComputeSalary);
	
	else
	
	if (value.equals("N"))
	{
		System.out.print("Alright thank you");
	}
		
	sc.close();
	
	}
}
