package com.tech;

import java.util.Scanner;

public class CharacterWrapperUseCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter: ");
		String a=sc.nextLine();
		
		int letters = 0;
        int digits = 0;
        int special = 0;
        
        for(int i=0;i<a.length();i++) {
        	char ch =a.charAt(i);
        	if(Character.isLetter(ch)) {
        		letters++;
        	}
        	else if (Character.isDigit(ch)) {
        		digits++;
        	}
        	else if (Character.isWhitespace(ch)) {
        		special++;
        		
        	}
        	
        	
        }
        System.out.println("letter"+letters);
        System.out.println("digit"+digits);
        System.out.println("special"+special);
        
		
	}

}
