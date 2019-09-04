package defaultpackage;

public class prog5 {

	public static void main (String args[]) {

	
	 //System.out.println(generate + "   " + generate);
	String top = "";
	String down = "";
	String line = "";
	String display = "";

	

	 for (int i = 0; i < 8; i++)
	 {
	
	  top += String.format("%4d\t\t", RandomNumbers.getRandomInt(0, 99));
	  down += String.format("+%3d\t\t", RandomNumbers.getRandomInt(0, 99));
	  line += "_______\t\t";
	  	
	  if (i == 3 || i == 7)
	  {
		  display += (top + "\n\n" + down + "\n" + line + "\n\n\n\n");
		  top = "";
		  down = "";
		  line = "";
		 
	  }
	  
	 
	 
	 }

	 
	 System.out.println(display);
}

}
