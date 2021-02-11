package com.techbeesolutions.assignments;

import java.util.Scanner;

public class Consonants {

	public static void main(String[] args) {
		
		int count = 0;
		
		String str="Hello how are you";
		String n = str.toLowerCase();
		
		String m = n.replaceAll("(?![aeiou])[a-z]", "*");
		
		 char ch[] = n.toCharArray();
		
		for (int i = 0 ; i<str.length(); i++ )
		{
	
			if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == ' ')
			{
				System.out.println("");
				
			}
			else
				count++;
	
			}
		
		System.out.println("Given Sentence: " + str);
		System.out.println("Number of consonants in the given sentence is " +count);
        System.out.println("Consonants replaced " + m );
	
		
		

	}

}
