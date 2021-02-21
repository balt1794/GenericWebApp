package source.layers.repositories;

import java.util.List;

import source.layers.models.User;

public interface UserDAO {

	/*
	 * List of all the methods that we are going to implement in our application
	 */

	/*
	 * SELECT CREATE READ UPDATE DELETE
	 */

	
	// get the element
	User getUser(int u_id);
	
	//create a new user
	void createUser(User u);
	
	//update user
	boolean updateUser(int key, User u);
	
	//delete user
	User deleteUser(int u_id);
	
	//get all Users
	List<User> getAllUsers();
	
	
}
