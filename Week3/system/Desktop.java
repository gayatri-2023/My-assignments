package org.system;

public class Desktop {

	public void desktopSize()
	{
		System.out.println("This is from desktop");
	}
	
	public static void main(String[] args) {
		Computer var= new Computer();
		var.computermode1();
		var.desktopSize();
		
}
}

//create above 2 class and call all your class methods into the Desktop using single inheritance.