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
		 
		 UserRegistration userreg = new UserRegistration();
		 
		 System.out.println("enter your firstname");
		 String name = sc.next();
		 userreg.name(name);
		
		 System.out.println("enter your lastname");
		 String lastName = sc.next();
		 userreg.lastName(lastName);
		 
		 System.out.println("enter your phone number");
		 String phone = sc.next();
		 userreg.phone(phone);
		 
		 System.out.println("enter your email");
		 String email = sc.next();
		 userreg.email(email);
		 
		 System.out.println("enter your firstname");
		 String password = sc.next();
		 userreg.password(password);
	 }
	 
		public boolean name(String name) {
		System.out.println("Enter a First Name");
		name = sc.next();
		String namePattern = "^[A-Z]{1}[a-z]{2,}$";
		Pattern compileName = Pattern.compile(namePattern);
		Matcher nameMatcher = compileName.matcher(name);
		if(nameMatcher.matches())
			return true;
		else 
			return false;
		}
		
		public String lastName(String lastName) {
		System.out.println("Enter a LastName");
		lastName = sc.next();
		String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$";
		Pattern compileLastName = Pattern.compile(lastNamePattern);
		Matcher lastNameMatcher = compileLastName.matcher(lastName);
		
		while(!lastNameMatcher.matches()) {
			System.out.println("Invalid input try again :");
			lastName = sc.next();
			lastNameMatcher = compileLastName.matcher(lastName);
			}
				return lastName;
		}
		
		
		public boolean email(String email) {
		System.out.println("Enter your emailid");
		email = sc.next();
		String emailPattern = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		Pattern compileEmail = Pattern.compile(emailPattern);
		Matcher emailMatcher = compileEmail.matcher(email);
		
		if(emailMatcher.matches())
			return true;
		else 
			return false;
		}
		
		
		public boolean phone(String phone) {
		System.out.println("Enter a Phone Number");
		phone = sc.next();
		String phonePattern = "^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[\s 0-9]*$";
		Pattern compilePhone = Pattern.compile(phonePattern);
		Matcher phoneMatcher = compilePhone.matcher(phone);
		if(phoneMatcher.matches())
			return true;
		else 
			return false;
		}
		
		public boolean password(String password) {
		System.out.println("Enter a Password");
		password = sc.next();
		String passwordPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
		Pattern compilePassword = Pattern.compile(passwordPattern);
		Matcher passwordMatcher = compilePassword.matcher(password);
		
		if(passwordMatcher.matches())
			return true;
		else 
			return false;
		}
}