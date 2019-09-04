package defaultpackage;

import java.util.Arrays;

public class prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr1 = new String[5];
		 String[]arr2 = new String[5];
		 boolean flag = true;
		 int increment = 0;
		 for (int i=0; i<arr1.length; i++)
		 {
			 for (int j=0; j<arr1.length; j++)
			 {
				 if (arr1[i].equals(arr1[j]) && i != j)
				 {
					 flag = false;
					 break;
				 }
			 }
			 
			 if (flag == true)
			 {
				arr2[increment] = arr1[i];
				increment++;
			 }
		 }
		 
		 System.out.println(Arrays.toString(arr2));
		 
		 
	}

}
