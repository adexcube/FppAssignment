package defaultpackage;

import java.util.Scanner;

public class prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		 String input = new String();
		 Scanner add = new Scanner(System.in);
		 
		 System.out.println("Kindly type in the input");
		 input = add.nextLine();
		 for (int i = input.length()-1; i >= 0; i--)
		 {
			 System.out.print(input.charAt(i));
		 }
	
		 
	}

}
