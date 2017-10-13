package com.wanda.chap7;

public class Array {
	
	public static void main(String[] args) {
		
		int[]  a = {45,23,64,34,46,56,8,5,3,6};
		System.out.printf("%s%8s\n", "index", "value");
		for(int c = 0; c < a.length; c++) {
			System.out.printf("%d%10d\n", c, a[c]);
		}
	}
}
