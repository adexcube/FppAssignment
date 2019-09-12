package fpplesson5;

public interface Figure {

	void getFigure();
	
}

final class UpwardHat implements Figure {
	
		public  void getFigure()
		{
			System.out.print("\\/");
		}
		
}
		
final class DownwardHat implements Figure {
	
		public void getFigure() 
		{
			System.out.print("/\\");
		}
}


final class FaceMaker implements Figure {
	
	public void getFigure()
	{
		System.out.print(":)");
	}
}

final class Vertical implements Figure {
	
	public void getFigure()
	{
		System.out.print("||");
		
	}	
}


	
	
	
