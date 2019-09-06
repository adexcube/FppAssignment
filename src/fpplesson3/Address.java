/**
 * 
 */
package fpplesson3;

/**
 * @author adeoyeadesina
 *
 */
public class Address {
	private String state;
	private String city;
	private String street;
	private String zip;
	
	
public Address (String state, String city, String street, String zip)
{
	this.state = state;
	this.city = city;
	this.street = street;
	this.zip = zip;
	
}


public String getState() {
	return state;
}


public String getCity() {
	return city;
}


public String getStreet() {
	return street;
}


public String getZip() {
	return zip;
}


	

	
}
