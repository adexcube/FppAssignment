package fpplesson5;


public class Persondeep implements Cloneable {
	String name;
	Computer computer;
	
	
	public Persondeep(String name, Computer computer) {
		this.name = name;
		this.computer = computer;
	}
	


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Computer getComputer() {
		return computer;
	}


	public void setComputer(Computer computer) {
		this.computer = computer;
	}


	public Object clone() throws CloneNotSupportedException {

		    Persondeep clone=(Persondeep)super.clone();
		    
		    //deep clone to clone the reference variable address
			   clone.computer = (Computer)this.computer.clone();
			   
			    return clone;
	}			
		
	
	
	
	

	 
	
	public static void main(String[] args) throws CloneNotSupportedException 
	{
	
   

      
      Persondeep newclone = new Persondeep("David", new Computer("DELL", "20", 16, 200));
    
      
      System.out.println("Before Cloning");
      System.out.println(newclone);
      
      Persondeep addafterclone = (Persondeep) newclone.clone(); 
      System.out.println("After Cloning");
      System.out.println(addafterclone);
   
         	       	     	     
	}
	

	
}
