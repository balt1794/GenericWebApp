package source.layers.services;

import java.util.List;

import source.layers.models.User;

public interface UserService {

	/*
	 * Services speciliazed for this particular 
	 * application using the DAO
	 */
	
	//parameter check
	boolean login (String username, String password);
	
	
	//obtain key
	User getUser(int u_id);
	
	//insert user
	void registerUser(int key, User u);
	
	//select * users
	List<User> getAllUsers();
}
