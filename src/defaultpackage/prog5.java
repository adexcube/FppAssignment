package defaultpackage;

public class prog5 {


	 int generate = RandomNumbers.getRandomInt(0, 99);
	 //System.out.println(generate + "   " + generate);
	String top = " ";
	String down = " ";
	String line = " ";
	 for (int i = 0; i < 5; i++)
	 {
	
	  top += String.format(" %t\t", generate);
	
	 
	 }
	 System.out.println(top);
	
}
