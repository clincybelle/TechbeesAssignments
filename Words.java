package com.techbeesolutions.assignments;

import java.util.Scanner;

public class Words {
	public static void main(String[] args) {
		String input;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Sentence:");
		
		String str = sc.nextLine();
		 
		if( str == null || str.isEmpty()) {
			
			System.out.println("Number of words is 0");
		
		}
		else {
		String[] words = str.split("\\s+");
		System.out.println("Number of words in the sentence is " +words.length);
		}
		
		
		
	}

}
