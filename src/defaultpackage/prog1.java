package defaultpackage;


public class prog1 {


	public static void main(String[] args) {
		
		int x, y;
		double ans, secondans;
		
		//Get a random number from 1 to 9 and raise PI to the power of the number
		x = RandomNumbers.getRandomInt(1,9);
		ans = Math.pow(Math.PI, x);
		
		//Get random number from 3 to 14
		y = RandomNumbers.getRandomInt(3, 14);
		secondans = Math.pow(y, Math.PI);
		
		//Output result to the console
		System.out.println("The result of PI to the power of x is " + ans);
		System.out.println("The result of y raised to the power of PI is " + secondans);	
	
	}	

}
