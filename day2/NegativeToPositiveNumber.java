package Week1.day2;

public class NegativeToPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =-40;
		if (num <0) {
			System.out.println("The number is a negative number:"+ num);
			
			num =-(-40);
			System.out.println("The number is coverted to positive number:" + num );
		}
		

	}

}
