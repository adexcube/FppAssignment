package defaultpackage;

public class prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		
		
		//starting question 2
		//Initialize
		float a = (float)1.27f;
		float b = (float)3.881f;
		float c = (float)9.6f;
		
		//Getting the sums of the values;
		int suma = (int)(a + b + c);
		int sumb = Math.round(a + b + c);
		
		//Output result to console
		System.out.println("The sum by casting is " + suma);
		System.out.println("The sum by rounding up is " + sumb);
		
		
		
		
		
	
		
	
		
	}

}
