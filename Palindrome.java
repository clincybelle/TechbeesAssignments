package com.techbeesolutions.assignments;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String rev ="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String str = sc.nextLine();
		
		int length = str.length();
		
		for( int i = length -1; i >= 0; i-- )
			rev = rev + str.charAt(i);
		
			if (str.equals(rev))
				System.out.println(str + " is a Palindrome.");
			else
				System.out.println(str + " is not a Palindrome.");
				
		// TODO Auto-generated method stub
	}
	

}
