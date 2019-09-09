package fpplesson3;

public class Customer {
	private String firstName;
	private String lastName;
	protected String socSecurityNo;
	private Address billingAdress;
	private Address shippingAddress;
	

	
	Customer(String firstName, String lastName, String socSecurityNo)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.socSecurityNo = socSecurityNo;

		
	}

	
	

	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getSocSecurityNo() {
		return socSecurityNo;
	}



	public void setSocSecurityNo(String socSecurityNo) {
		this.socSecurityNo = socSecurityNo;
	}



	public Address getBillingAdress() {
		return billingAdress;
	}



	public void setBillingAdress(Address billingAdress) {
		this.billingAdress = billingAdress;
	}



	public Address getShippingAddress() {
		return shippingAddress;
	}



	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	

	
	public String toString() {
		return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNo
		+ "]";
		}
	
}



