package org.system;

public class AxisBank extends BankInfo {
	
	public static void main(String Args[]) {
		AxisBank var = new AxisBank();
		var.deposit(3000);
		var.fixed();
		
	}
	
	public void deposit(int amount)
	{
		System.out.println("This method is from Axis Bank "+ amount);
	}

}
