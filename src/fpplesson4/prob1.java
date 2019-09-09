package fpplesson4;

public class prob1 {
	


	public static void main (String []args) {
	String str1 = "acce";
	String str2 = "bdfc";
	
	System.out.println("result is: " + user(str1, str2));
	
	}

	public static String user(String str1, String str2)
	{
		return sortstring (str1, str2);
	}
	public static String sortstring(String str1, String str2)
	{
		
			
		String newstr = str1 + str2;
		if (newstr.length() == 1)
			return newstr;
		if (newstr.length() == 0)
			return "";
		
		String [] arr1 = newstr.split("");
		
		String first = arr1[0];
		
		
		for (int i=1; i<arr1.length; i++)
		{
			if (arr1[i].compareTo(first) < 0)
			first =arr1[i];
			
		}
		
		str1 = str1.replaceFirst(first, "");
		str2 = str2.replaceFirst(first, "");
		//if (str1.indexOf(first) == 0)
		//str1 = str1.substring(0, str1.indexOf(first)) + str1.substring(str1.indexOf(first) + 1);
		//else 
		//str2 = str2.substring(0, str2.indexOf(first)) + str2.substring(str2.indexOf(first) + 1);
		
		return (first + sortstring (str1, str2));
	}

}

