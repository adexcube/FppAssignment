package fpplesson5;

abstract class Employee {
String firstName;
String lastName;
String socialSecurityNumber;


public Employee(String firstName, String lastName, String socialSecurityNumber) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.socialSecurityNumber = socialSecurityNumber;
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




public String getSocialSecurityNumber() {
	return socialSecurityNumber;
}




public void setSocialSecurityNumber(String socialSecurityNumber) {
	this.socialSecurityNumber = socialSecurityNumber;
}




abstract double getPayment();

@Override
public String toString()
{
	return "First Name is:" + firstName + "\n\n Last Name is: " + lastName + "\n\n Social Security Number is: " + socialSecurityNumber;
}


}
