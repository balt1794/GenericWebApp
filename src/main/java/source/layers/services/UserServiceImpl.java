package source.layers.services;

import java.util.List;

import source.layers.models.User;
import source.layers.repositories.UserDAOImpl;

public class UserServiceImpl implements UserService {

	UserDAOImpl user = new UserDAOImpl();
	


	@Override
	public User getUser(int u_id) {
		return user.getUser(u_id);
	}

	@Override
	public void createUser(User u) {
		user.createUser(u);

	}

	@Override
	public List<User> getAllUsers() {
		return user.getAllUsers();
	}
	
	@Override
	public boolean login(String username, String password) {
		return false;
	}

}
