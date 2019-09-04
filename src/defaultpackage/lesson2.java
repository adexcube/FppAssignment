package defaultpackage;

import java.util.*;

//import javax.swing.JOptionPane;
public class lesson2 {

	public static void main(String[] args) {
	
		
		String name = "Robert";
		name.substring(1, 3);
		name.substring(0, name.length());
		name.subSequence(0, 1);
		name.substring(0, 0);
		
		
	      name.indexOf("t");
	      name.indexOf("bert");
	
	      
	      StringJoiner sj = new StringJoiner(":", "[", "]");
	      sj.add("Tolulope").add("Tolani").add("Toluwase");
	      System.out.println(sj);
	      String display = sj.toString();
	      System.out.print(display);
	      System.out.println();
	      
	      String a = new String("juliet");
	      String b = new String("Andersom");
	      String c = new String("juliet");
	      String d = new String("kelvin");
	      
	      System.out.println(a.compareTo(b));
	      System.out.println(a.compareTo(d));
	      System.out.println(a.compareTo(c));
	      
	      
	}


}
