package lesson2.escapesequence;

import java.util.Random;

public class EscapeSequence {
	public static void main(String args[]) {
	/*	System.out.println("First line\nSecond line");
		System.out.println("A\tB\tC");
		System.out.println("\tD\tF") ;
		System.out.println("The character is "+"\u0041"); 
		System.out.println("Welcome to Java \rProgramming");
		boolean res = Character.isJavaIdentifierStart('_');
		System.out.println(res);*/
		
		System.out.println(Math.random()); // Print a Random number in the range of 0-1
		
		// Random Class
		Random ob = new Random();
		System.out.println(ob.nextInt());
		System.out.println(ob.nextInt(10));
		
		byte x = 5;
		byte y = 7;
		int z = ( x + y); 

		
		}
}
