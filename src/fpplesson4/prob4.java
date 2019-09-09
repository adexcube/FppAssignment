package fpplesson4;

public class prob4 {


	public static void main (String []args){
		String str = "madam";
	System.out.println("Palindrome: " + user(str));
		
	}
	static boolean user (String word)
	{
		return palindrome(word);
	}
	
	static boolean palindrome (String word) {
		
	if (word.length() == 0 || word.length() == 1)
		return true;
		

	String arr[] = word.split("");
	int len =arr.length-1;
	if (arr[0].equals(arr[len]))
	return (palindrome(word.substring(1, word.length() - 1)));
	
	
	return false;
	}
	
}
