package defaultpackage;

public class prog8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num[] = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};
		 int num1 = num[0];
		 
		 for (int i=0; i<num.length; i++)
		 {
			 if (num[i] < num1)
			 {
				 num1 = num[i];
			 }
		 }
		 
		 System.out.println(num1);
	}

}
