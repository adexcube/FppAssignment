package fpplesson3;



final class Circle {
	private final double radius;

	
	//create constructor
	public Circle (double radius)
	{
		this.radius = radius;
	}


	public double getRadius() {
		return radius;
	}
	
	public double getArea(double radius)
	{
		return (Math.PI * Math.pow(radius, 2));
	}
}
