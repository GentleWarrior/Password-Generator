package PasswordGenerator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter Length of Password: ");
		Scanner input = new Scanner(System.in);
		int digit = input.nextInt();
		
		String lower_cases = "qwertyuiopasdfghjklzxcvbnm";
		String upper_cases = "QWERTYUIOPLKJHGFDSAZXCVBNM";
		int num = 0-9  ;
		
		String password = "";
		
		for(int i = 0; i < digit; i++) {
			int rand = (int)(3 * Math.random());
			
			switch (rand) {
				case 0:
					rand = (int)(num * Math.random());
					password += String.valueOf((int)rand);
					//password += String.valueOf((int)(0 * Math.random()));
					break;
				case 1:
					rand = (int)(lower_cases.length() * Math.random());
					password += String.valueOf(lower_cases.charAt(rand));
					break;
				case 2: 
					rand = (int)(upper_cases.length() * Math.random());
					password += String.valueOf(upper_cases.charAt(rand));
					break;	
				//case 3:
					//rand = (int)(num * Math.random());
					//password += String.valueOf(rand);
					//break;	
				
		}
		
		}
		
		System.out.println("Your random Password is: " + password);

	}

}
