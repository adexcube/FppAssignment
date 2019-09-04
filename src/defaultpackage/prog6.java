package defaultpackage;

import java.util.Arrays;

public class prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr1 = {"horse", "dog", "cat", "horse","dog"};
		

		 int count = 0;
		 for (int i=0; i<arr1.length-1; i++)
		 {
			 for (int j=i+1; j<arr1.length; j++)
			 {
				 if (arr1[i].equals(arr1[j]))
		
					count++;
				 
			 }
		 }	
			 
		int newlen = arr1.length - count;	
		
		 String [] arr2 = new String[newlen];
		 boolean flag = true;
		 count = 0;
		 for (String check : arr1)
		 {
			for (int i=0; i<arr2.length; i++)
			{
				if (check.equals(arr2[i]))
				{
					flag = false;
					break;
				}		
			}
			
			if (flag == true)
			{
				arr2[count] = check;
				count++;
			}
		 }
		 
	 
		 System.out.println(Arrays.toString(arr2));
		 
		 
	}

}
