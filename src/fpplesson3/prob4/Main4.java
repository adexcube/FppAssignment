package fpplesson3;
import java.util.*;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter C for Circle: \n\nEnter R for Rectangle: \n\nEnter T for Triangle");
		Scanner sc = new Scanner (System.in);
		String input = sc.nextLine();
		
		
		//create an if statement to work on the calculation
		switch (input)
		{
		case "C":
			System.out.println("Enter the radius of the Circle: ");
			double radius = sc.nextDouble();
			Circle area = new Circle(radius);
			System.out.println("The area of a the Circle is " + area.getArea(radius));
			break;
		case "R":
			System.out.println("Enter the length of the Rectangle: ");
			double length = sc.nextDouble();
			System.out.println("Enter the width of the Rectangle: ");
			double width = sc.nextDouble();
			Rectangle rectarea = new Rectangle(length, width);
			System.out.println("The area of a the Rectangle is " + rectarea.getArea(length, width));
			break;
		case "T":
			System.out.println("Enter the height of the Triangle: ");
			double height = sc.nextDouble();
			System.out.println("Enter the base of the Triangle: ");
			double base = sc.nextDouble();
			Triangle triarea = new Triangle(height, base);
			System.out.println("The area of the Triangle is " + triarea.getArea(height, base));
			break;
		default:
			System.out.println("Unknown value, kindly try again");
			break;
		}
		
		sc.close();
	}
	
}
