package Week2.day3;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {1,2,3,4,7,8};
		int j=1;
		Arrays.sort(arr);
		for (int i=0;i<arr.length;i++)
		{
		
		if (j==arr[i]) {
			j++;
			}
		System.out.println(j);
	
		}
		
		}
	}


