package com.useregistration;



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
		
		
}