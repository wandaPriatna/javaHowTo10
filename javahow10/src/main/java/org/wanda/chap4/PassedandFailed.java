package org.wanda.chap4;

import java.util.Scanner;

public class PassedandFailed {

	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	
	int counter = 1; 
	int succes = 0;
	int failed = 0;
	
	System.out.println("Enter 1 to passed and -1 to failed");
	while(counter <= 10) {
		
		int result = in.nextInt();
		if(result == 1 ) {
			succes +=1;
		}
		else if(result == -1){
			failed += 1;
		}
		counter++;
	}
	if(succes > 8) {
		System.out.println("Bonus To Insturctor");
	}
	System.out.println("Sum Success " + succes);
	System.out.println("Sum Failed " + failed);
}
}
