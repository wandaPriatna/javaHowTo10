package org.wanda.chap4;

import java.util.Scanner;

public class ClassAverage {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int counter = 1;
		int grade = 0;
		int total = 0;
		
		System.out.println("Masukan Grade : " );
		while (counter <= 10) {
			grade = input.nextInt();
			 total = total+ grade;
			counter += 1;
		}
		
		System.out.println("Grade : " + total);
		int sum = total / 10;
		System.out.println("Class Average is " + sum);
	}
}
