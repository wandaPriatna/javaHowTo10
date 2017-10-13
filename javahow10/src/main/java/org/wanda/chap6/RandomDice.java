package org.wanda.chap6;

import java.security.SecureRandom;

public class RandomDice {
	
	public static void main(String[] args) {
		
		SecureRandom random = new SecureRandom();
		
		for(int i = 1; i <= 20; i++) {
			
			int j = 1 + random.nextInt(6);
			System.out.printf("%d ", j);
			
			if(i % 5 == 0) {
				System.out.println();
			}
		}
		
	}

}
