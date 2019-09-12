package fpplesson5;

public class Main {

	public static void main (String args[]) {
		//Rectangle newrect = new Rectangle("blue", 2000, 2000);
	//	Square newsqa= new Square ("yellow", 200);
	//	Circle newcir = new Circle("green", 100);
		
		Shape[] sh = new Shape[3];
		sh[0] = new Rectangle("blue", 2000, 2000);
		sh[1] = new Square ("yellow", 200);
		sh[2] = new Circle("green", 100);
	
	for (Shape roll : sh)
	{
		System.out.println(roll.calculateArea() + "\n" + roll.calculatePerimeter() + "\n\n");

	}
		
	}
	
	
}
	

