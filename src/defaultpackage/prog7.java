package defaultpackage;

public class prog7 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (String pass : args)
		{
			System.out.println(pass.length());
			if (pass.startsWith("A"))
				count++;
			
		}
		 System.out.println("String input starting with A: " +count);
		
		
	}

}
