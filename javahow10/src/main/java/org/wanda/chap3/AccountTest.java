package org.wanda.chap3;

import java.util.Scanner;

public class AccountTest {
	
	public static void main(String[] args) throws Exception {
		
		Scanner input = new Scanner(System.in);
		Account account = new  Account("John doe", 0);
		
		System.out.println("Initial Name is : " + account.getName());
		
		System.out.println("Enter String Name and press enter after finish  : " );
		String in = input.nextLine();
		account.setName(in);
		System.out.println("Enter Balance ");
		int bal = input.nextInt();
		account.setBalance(bal);
		
		System.out.println("After Initialized : " + account.getName());
		System.out.println("Balance :  " + account.getBalance());
		
	}

}
