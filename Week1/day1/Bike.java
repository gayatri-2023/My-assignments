package Week1.day1;

public class Bike {
	
	
public void driveBike() {
	System.out.println("Do's and Dont's while driving bike");
	
}

public void applyBrake() {
	System.out.println("Please apply brakes while driving bike");
}

public void soundHorn() {
	System.out.println("Please apply horn while driving bike");
}

public void isPuncture() {
	System.out.println("The tyres may puncture while driving bike");
}



public static void main(String[] args) {
	// TODO Auto-generated method stub

	
	Bike b1 = new Bike();
	b1.driveBike();
	b1.applyBrake();
	b1.soundHorn(); 
	b1.isPuncture();
}

}
