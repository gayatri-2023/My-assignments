package org.student;

public class students {

	public static void main(String[] args) {
		
		students var = new students();
		var.getStudentInfo(3456);
		var.getStudentInfo(345,"Gayatri");
		var.getStudentInfo(456789999,"gayatri26.dandapat@gmail.com");
		
	}

	public void getStudentInfo(int id) {
		System.out.println("The student id is "+id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("The student id is "+id + " and name is "+name);
	}
	
	public void getStudentInfo(double phonenumber ,String email) {
		System.out.println("The student phone is "+phonenumber + " and email is "+email);
	}
	}
	

