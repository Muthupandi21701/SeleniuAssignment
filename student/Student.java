package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Muthupandi");
	}
	public void studentDepartment() {
		System.out.println("Mechanical Engineering");
	}
		public void studentId() {
			System.out.println("18ME17");
			
			
		}
		public static void main(String[] args) {
			
			Student student=new Student();
					
					student.studentName();
			        student.studentId();
		        	student.studentDepartment(); 
		        	student.collegeName();
		        	student.collegeCode();
		        	student.collegeRank();
		        	
		        	
		        	
					
					
		}	
		
	}


