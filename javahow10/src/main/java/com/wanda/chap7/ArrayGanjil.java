package com.wanda.chap7;

public class ArrayGanjil {

public static void main(String[] args) {
		
		int[]  a = new int[10];
		
		System.out.printf("%s%8s\n", "index", "value");
		
		for(int c = 0; c < a.length; c++) {
			a[c] = 1 + c;
			if(a[c] %2 != 0) {
				System.out.printf("%d%10d\n", c, a[c]);
			}
			
		}
	}
}
