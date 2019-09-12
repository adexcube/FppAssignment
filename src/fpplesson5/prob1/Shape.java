package fpplesson5;

public class Shape {
	String color;
	
	 Shape(String color){
		this.color = color;
		
	}
	
	double calculateArea()
	{
		return 0.0;
	}
	
	double calculatePerimeter()
	{
		return 0.0;
	}
	
}
	
	class Rectangle extends Shape {
		

		double width;
		double height;
		
		public Rectangle (String color, double width, double height)
		{
			super(color);
			this.width = width;
			this.height = height;
			
		}
		
		@Override
		public double calculateArea()
		{
			return width * height;
		}
		
		public double calculatePerimeter()
		{
			return 2 * (width + height);
		}
		
	}
	
		class Circle extends Shape {
			double radius;
			
		Circle (String color, double radius)
		{
			super(color);
			this.radius = radius;
		}
	    
	@Override
	
		public double calculateArea()
		{
			return Math.PI * Math.pow(radius, 2);
		}
		
		public double calculatePerimeter()
		{
			return 2 * Math.PI * radius;
		}
		
	
	}
		
		
	class Square extends Shape {
		double side;
		
		Square (String color, double side)
		{
			super(color);
			this.side = side;
		}
	
	
		@Override
		
		public double calculateArea()
		{
			return side * side;
		}
		
		@Override
		public double calculatePerimeter() 
		{
			return 4 * side;
		}
	
}		
