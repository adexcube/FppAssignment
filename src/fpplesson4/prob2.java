package fpplesson4;


public class prob2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "fcceebwwz";
		char value = 'z';
	
		
		System.out.println("result is: " + user(str, value));
		
		}
		static char user(String str, char value)
		{
			return minimum(str, value);
		}
		
		static char minimum(String str, char value)
		{
		
		if (str.length() == 1)
		return value;
		//System.out.println (value);
		if (str.charAt(1) < value)
		{
		value = str.charAt(1);
		}
		
		str = str.substring(1);
		
		return minimum(str, value);
	
	}

}
	

