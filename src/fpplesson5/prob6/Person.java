package fpplesson5;



public class Person implements Cloneable {
	String name;
	Computer computer;
	
	
	public Person(String name, Computer computer) {
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

		    Person clone=(Person)super.clone();
			return clone;
	}			
			

	// Shallow copy of Cloning, assigning objects to instance references 
	
	public static void main(String[] args) throws CloneNotSupportedException 
	{
	
    // Deep copy of Cloning copy the objects instance references too
      
      Person newclone = new Person("David", new Computer("DELL", "20", 16, 200));
    
      
      System.out.println("Before Cloning");
      System.out.println(newclone);
      
      Person addafterclone = (Person) newclone.clone(); 
      System.out.println("After Cloning");
      System.out.println(addafterclone);
   
         	       	     	     
	}
	

	
}
