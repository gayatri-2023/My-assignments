package org.student;

import org.department.department;

public class student extends department{

	public void studentName()
		{
			System.out.println("The method student name belongs to student");
		}
	
	public void studentDept()
		{
			System.out.println("The method student dept belongs to student");
		}
	
	
	public void studentId(){}
		{
			System.out.println("The method student id belongs to student");
		}
	
	
		public static void main (String Args[]) {
			
			student var = new student();
			var.collegeCode();
			var.collegeName();
			var.collegeRank();
			var.deptName();
			var.studentName();
			var.studentDept();
			var.studentId();
		}
}
