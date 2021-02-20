package test.layers.User;

import static org.junit.Assert.*;

import org.junit.Test;

import source.layers.repositories.UserDAOImpl;

public class UserTest {

	@Test
	public void getAllUsers() {
		UserDAOImpl us = new UserDAOImpl();
		boolean response = false;
		if(us.getAllUsers() != null) 
			response = true;
		
		assertTrue(response);
	}

}
