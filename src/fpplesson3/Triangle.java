package fpplesson3;




final class Triangle {
	private final double height;
	private final double base;
	
	
	//Creating a constructor
	public Triangle (double height, double base){
		this.height = height;
		this.base = base;

	}


	public double getHeight() {
		return height;
	}


	public double getBase() {
		return base;
	}

	public double getArea(double height, double base)
	{
		return (base * height / 2);
	}



}

