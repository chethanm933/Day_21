package com.useregistration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

public class UserRegistration {
	
	static Scanner sc = new Scanner(System.in);
	
	 public static void main(String[] args) {
		
		 System.out.print("Enter the first name : ");
			try {
				String name = sc.nextLine();
				char val = name.charAt(20);
				String namePattern = "^[A-Z]{1}[a-z]{2,9}$";
				Pattern compileName = Pattern.compile(namePattern);
				Matcher NameMatcher = compileName.matcher(name);
				sc.close();
				System.out.print(val);

				if (NameMatcher.matches()) {
					System.out.println(name + " is valid name.");
				} else {
					System.out.println(name + " is invalid name please try again.");
				}
			}

			catch (StringIndexOutOfBoundsException e) {
				System.out.println("StringIndexOutOfBoundsException");
			}
			
			
			System.out.print("Enter the last name : ");
			try {
				String lastName = sc.nextLine();
				char val = lastName.charAt(20);
				String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$";
				Pattern compileLastName = Pattern.compile(lastNamePattern);
				Matcher lastNameMatcher = compileLastName.matcher(lastName);
				sc.close();
				System.out.print(val);

				if (lastNameMatcher.matches()) {
					System.out.println(lastName + " is valid ");
				} else {
					System.out.println(lastName + " is invalid try again");
				}
			}

			catch (StringIndexOutOfBoundsException e) {
				System.out.println("StringIndexOutOfBoundsException");
			}

			System.out.print("Enter the valid mail ID : ");
			try {
				
				String email = sc.nextLine();
				char val = email.charAt(20);
				String emailPattern = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
				Pattern compileEmail = Pattern.compile(emailPattern);
				Matcher emailMatcher = compileEmail.matcher(emailPattern);
				sc.close();
				System.out.print(val);

				if (emailMatcher.matches()) {
					System.out.println(emailPattern + " is valid ");
				} else {
					System.out.println(emailPattern + " is invalid please try again");
				}
			}

			catch (StringIndexOutOfBoundsException e) {
				System.out.println("StringIndexOutOfBoundsException");
			}
			
		 System.out.print("Enter the phone number : ");
			try {
				String phone = sc.nextLine();
				int val = Integer.parseInt("");
				String phonePattern = "^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[\s 0-9]*$";
				Pattern compilePhone = Pattern.compile(phonePattern);
				Matcher phoneMatcher = compilePhone.matcher(phone);
				sc.close();
				System.out.print(val);

				if (phoneMatcher.matches()) {
					System.out.println(phone + " is valid ");
				} else {
					System.out.println(phone + " is invalid name.please try again.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Number format exception");
			}
			
			System.out.print("Enter the password : ");
			try {
			String password = sc.nextLine();
			String passwordPattern = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*#?&]{8,}$";
			Pattern compilePassword = Pattern.compile(passwordPattern);
			Matcher passwordMatcher = compilePassword.matcher(password);
			
			int val = Integer.parseInt("");
			sc.close();
			System.out.print(val);

			if (passwordMatcher.matches()) {
				System.out.println(password + " is valid ");
			} else {
				System.out.println(password + " is invalid please ty again.");
			}
		} catch (NumberFormatException e) {
			System.out.println("Password  exception");
		}
	 }
	 
}