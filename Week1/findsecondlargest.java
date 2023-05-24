package Week2.day3;

import java.util.Arrays;

public class findsecondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {3,2,11,4,6,7};
		 Arrays.sort(num);  //sorting array
		
		for (int i = 0 ;i<num.length;i++) {
		
			System.out.print(" "+num[i]);}
		
			System.out.println("The second larget number is " + num[4] );
			
	
	}

}
