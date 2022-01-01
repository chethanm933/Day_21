package com.useregistration;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
	public class ParaTest {
	
	String name;
	String lastName;
	String email;
	String phone;
	String password;
	boolean expectedName;
	boolean expectedLastName;
	boolean expectedPhone;
	boolean expectedEmail;
	boolean expectedPassword;
	
	static UserRegistration userreg;
	
	public ParaTest(String name, String lastName, String email, String phone, String password, boolean expectedName,
			boolean expectedLastName, boolean expectedEmail, boolean expectedPhone, boolean expectedPassword) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.expectedName = expectedName;
		this.expectedLastName = expectedLastName;
		this.expectedPhone = expectedPhone;
		this.expectedEmail = expectedEmail;
		this.expectedPassword = expectedPassword;
	}


	@Before
		public void initialize() {
		userreg =new UserRegistration();
	}


	@Parameterized.Parameters
		public static Collection inputs() {
		return Arrays.asList(new Object[] [] {{"","","","","","",false,false,false,false,false}, {"Name","Lastname","email00@gmail.com","+988888888888", "Pass@123",true, true, true, true},{"name","lastname","email123.co@mail.co.in","8971946256","Pass@1+2",false,false,true,true,false} } );
	}
	
	
	@Test
	public void validateFirstName() {
		assertEquals(expectedName, userreg.name(name));
	}

	@Test
	public void validateLastName() {
		assertEquals(expectedLastName, userreg.lastName(lastName));
	}

	@Test
	public void validateContactNumber() {
		assertEquals(expectedPhone, userreg.phone(phone));
	}

	@Test
	public void validateEmailId() {
		assertEquals(expectedEmail, userreg.email(email));
	}
	
	@Test
	public void validatePassword() {
		assertEquals(expectedPassword, userreg.password(password));
	}
	
}




