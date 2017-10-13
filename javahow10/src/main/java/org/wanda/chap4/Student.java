package org.wanda.chap4;

public class Student {
	
	private String name;
	private double average;
	
	public Student(String name, double average) {
		super();
		this.name = name;
		if(average < 0.0) {
			if(average >= 100.0)
				this.average = average;
		}
		else {
			System.out.println("Value Tidak boleh lebih kecil dari 0.0 dan lebih besar dari 100.0 ");
		}
	}
	
	public Student() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getAverage() {
		return average;
	}
	
	public void setAverage(double average) {
		
		if(average > 0.0) {
			if(average <= 100.0)
				this.average = average;
		}
		else {
			System.out.println("Value Tidak boleh lebih kecil dari 0.0 dan lebih besar dari 100.0 ");
		}
	}
	
	public String getLatterGrade() {
		String latterGrade = "";
		
		if(average >= 90) {
			latterGrade = "A";
		}
		else if(average >= 75 ) {
			latterGrade = "B";
		}
		else if(average >= 65 ) {
			latterGrade = "C";
		}
		else {
			latterGrade = "D";
		}
		
		return latterGrade;
	}
	
	

}
