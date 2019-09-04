package lesson2.formattedoutput;

import java.text.MessageFormat;
import java.util.Date;

public class FormatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("You owe me $%f \n", 195.50f);		
		System.out.printf("You owe me $%.2f \n", 195.50f);
		System.out.printf("You owe me $%7.2f \n", 195.50f);

		String name = "Bob";
		int age = 30;
		System.out.printf("Happy birthday %s. I can't believe you're %d.",name,age);
		
		String oweMe = String.format("You owe me %.2f dollars", 196f);
		String oweMe2 = String.format("You owe me %d dollars", 196);
		System.out.println(oweMe);
		System.out.println(oweMe2);
		
		String date = String.format("Today's date: %tD", new Date());
		System.out.println(date);//	Print	current date: mm/dd/yy
		
		Object [] params = {"animal", "dog"};
		String stringWithParameter = 
		    "Look at that {0} -- it looks like a {1}.";
		System.out.println("original string: " + stringWithParameter);
		System.out.println("formatted string: " + 
		MessageFormat.format(stringWithParameter,params));
	}
}
