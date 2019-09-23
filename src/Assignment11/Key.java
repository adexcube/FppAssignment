package lesson12prob1;


import java.util.Objects;

public class Key {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}
	


	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (this.getClass() != obj.getClass()) return false;
		Key newk = (Key)obj;
		return (this.firstName.equals(newk.firstName)) && (this.lastName.equals(newk.lastName));
	}
	
	
}
