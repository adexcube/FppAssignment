package fpplesson5;

public class Main3 {
	
	

	public static void main(String[] args) {

	Figure [] fg = new Figure[5];
	
	fg[0] = new UpwardHat ();
	fg[1] = new UpwardHat ();
	fg[2] = new DownwardHat();
	fg[3] = new FaceMaker();
	fg[4] = new Vertical();
	
	
	for (Figure roll : fg )
	{
		roll.getFigure();
	}
	
	System.out.println("\n");
	
	for (Figure roll : fg )
	{
		
		System.out.print(roll.getClass().getSimpleName());
		roll.getFigure();
		System.out.println();
	}
	
	
	
}	
	
	

		

	

}
