package fpplesson12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) throws MyException {
		@SuppressWarnings("resource")
		
		
		Scanner input = new Scanner (System.in);
		System.out.println("Kindly enter a number from 0 to 100");
		try {
		int newnum = input.nextInt();
		
		if (newnum < 0) throw new MyException("Value input is less than 0");
		else 
		if (newnum >100) throw new MyException("Value input is higher than 100");	
		}
		
		catch (InputMismatchException f) 
		{
			throw new MyException("Input Mismatch");
		}
		
		finally
		{
			System.out.println("Program Terminated");
		}
		
		input.close();
		
		}	
	}
	
	
	class MyException extends Exception {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public MyException() {
			super();
		}
		
		public MyException(String result) {
			super();
			System.out.println(result);
			
		}
		
	}

