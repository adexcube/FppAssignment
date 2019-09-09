package fpplesson4;

import java.util.Arrays;

public class prob3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,23,32,12,54,43,33};
		
		System.out.println("value is: " + user(arr, 10));
	}

	static int user (int[]arr, int target)
	{
		return bsearch(arr, target);
	}
	static int bsearch (int[]arr, int target)
	{
		int [] arr1 = {};
		
		if (arr.length == 0)
			return -1;
		if (target == arr[0])
			return arr[0];
		if (target == arr[arr.length-1])
			return arr[arr.length-1];
		int len = arr.length / 2;
			Arrays.sort(arr);
		if (target == arr[len])
				return target;
		if (target < arr[len]) {
		arr1 = Arrays.copyOfRange(arr, 0, len-1);
		}
		if (target > arr[len]) {
			arr1 = Arrays.copyOfRange(arr, len + 1, arr.length - 1);
		}
		
		arr = arr1;
		
		return 	bsearch (arr, target);
	}
}
