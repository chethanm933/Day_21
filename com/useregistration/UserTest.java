package com.useregistration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UserTest {

	@Test
	public void testUser() {
		UserRegistration userreg = new UserRegistration();
		assertEquals("Chethan", userreg.name("Chethan"));
		assertEquals("Kar", userreg.name("Kar"));
		assertEquals("+918888888888", userreg.name("+918888888888"));
		assertEquals("abc.co@abc.co.in", userreg.name("abc.co@abc.co.in"));
		assertEquals("Abc@1def", userreg.name("Abc@1def"));
	}
}
