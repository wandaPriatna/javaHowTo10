package com.wanda.chap7;

public class ModifyArray {

public static void main(String[] args) {
		
		int[]  a = new int[10];
		
		System.out.println("Original Array");
		
		System.out.printf("%s%8s\n", "index", "value");
		
		for(int c = 0; c < a.length; c++) {
			a[c] = 2 + 2 *c;
			System.out.printf("%d%10d\n", c, a[c]);
		}
		System.out.println("====================");
		System.out.println("Modify Array");
		modiy(a);
		System.out.println("====================");
		System.out.println("Modify Element");
		modifyElement(a[1]);
		
	}

private static void modifyElement(int i) {
	int a = i + 100;
	System.out.println(a);
}

public static void modiy(int ar[]) {

	for(int c = 0; c < ar.length; c++) {
		ar[c] = 4 + 4 *c;
		System.out.printf("%d%10d\n", c, ar[c]);
	}
}
}
