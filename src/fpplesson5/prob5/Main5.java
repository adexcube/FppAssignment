package fpplesson5;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer com1 = new Computer("HP", "AMD", 16, 120);
		Computer com2 = new Computer("DELL", "INTEL", 20, 130);
		Computer com3 = new Computer("HP", "AMD", 16, 120);
		
		
		System.out.println("Is Com1 equal to Com2: " + com1.equals(com2));
		System.out.println("Is Com1 equal to Com3: " + com1.equals(com3));
		
		
		
		
	}

}
