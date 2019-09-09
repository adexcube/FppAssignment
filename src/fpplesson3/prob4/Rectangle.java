package fpplesson3;



final class Rectangle {
private final double length;
private final double width;
	
	//create constructor
	 Rectangle (double length, double width)
	{
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}
	
	public double getArea(double length, double width)
	{
		return (length * width);
	}
}


