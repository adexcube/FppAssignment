/**
 * 
 */
package fpplesson3;

/**
 * @author adeoyeadesina
 *
 */
public class Prog1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer [] cs = new Customer[3];
		cs[0] = new Customer("Jackson", "Daniel", "123456789");
		cs[1] = new Customer("Solomon", "Talsa", "123456543");
		cs[2] = new Customer("Jack", "Jack", "123456123");
		
		
		cs[0].setBillingAdress(new Address("Iowa","Chicago","Nstreet","52557"));
		cs[0].setShippingAddress(new Address("Illinois","Fairfield","Numwell","45662"));
		
		cs[1].setBillingAdress(new Address("Iowa","Fairfield","Nstreet","52557"));
		cs[1].setShippingAddress(new Address("Illinois","York","Numwell","45662"));
		
		cs[2].setBillingAdress(new Address("Iowa","Fairfield","Nstreet","52557"));
		cs[2].setShippingAddress(new Address("Illinois","Atlanta","Numwell","45662"));
		
		
		for (Customer check : cs ) 
		{
			if (check.getBillingAdress().getCity().equals("Chicago"))
					{
						System.out.println(check.getFirstName() + " " + check.getLastName());
					}
		}
		
	}

}