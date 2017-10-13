package org.wanda.chap4;

import java.util.Scanner;

import org.wanda.chap3.Account;

public class StudentTest {

public static void main(String[] args) throws Exception {
		
		Scanner input = new Scanner(System.in);
		Student student = new  Student("John doe", 0);
		
		System.out.println("Initial Name is : " + student.getName());
		
		System.out.println("Enter String Name and press enter after finish  : " );
		String in = input.nextLine();
		student.setName(in);
		
		System.out.println("Enter Grade  ");
		double avg = input.nextDouble();
		
		student.setAverage(avg);
		
		System.out.println("After Initialized : " + student.getName());
		System.out.println("Average is  :  " + student.getAverage());
		System.out.println("Latter Grade is " + student.getLatterGrade());
		
	}
}
