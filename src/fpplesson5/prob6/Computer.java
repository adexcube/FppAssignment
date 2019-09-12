package fpplesson5;

public class Computer implements Cloneable {
String manufacturer;
String processor;
int ramSize;
double processorSpeed;


public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) 
{
	this.manufacturer = manufacturer;
	this.processor = processor;
	this.ramSize = ramSize;
	this.processorSpeed = processorSpeed;
	
}


public int getRamSize() {
	return ramSize;
}


public double getProcessorSpeed() {
	return processorSpeed;
}

public double computePower()
{
	return ramSize * processorSpeed;
}

@Override
public String toString()
{
	return "The power used by the computer is: " + computePower();
}


@Override

public int hashCode()
{
	int hash = 5;
	hash = 13 * hash + manufacturer.hashCode() * processor.hashCode() * processor.hashCode();
	return hash;
}

public boolean equals(Object ab)
{
	if (ab == null) return false;
	if (!(ab instanceof Computer)) return false;
	Computer set = (Computer) ab;
	return  (set.manufacturer.equals(manufacturer)) && 
		(set.processor.equals(processor)) &&
		(set.ramSize == ramSize) &&
		(set.processorSpeed == processorSpeed);
		
}


@Override

protected Object clone() throws CloneNotSupportedException {
	Computer computer = (Computer) super.clone();
	return computer;
}




}
