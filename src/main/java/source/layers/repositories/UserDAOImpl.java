package source.layers.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import source.layers.models.User;
import source.layers.util.UserFakeDB;

public class UserDAOImpl implements UserDAO {

	@Override
	public User getUser(int u_id) {
		return UserFakeDB.userDB.get(u_id);
	}

	@Override
	public void createUser(int key, User u) {
		UserFakeDB.userDB.put(key, u);
		
	}

	@Override
	public boolean updateUser(int key, User u) {
		UserFakeDB.userDB.replace(key, u);
		return true;
	}

	@Override
	public User deleteUser(int u_id) {
		return UserFakeDB.userDB.remove(u_id);
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<User>();
		
		Set<Integer> keys = new TreeSet<Integer>();
		keys.addAll(UserFakeDB.userDB.keySet());
		
		
		
		for(Integer i : keys) {
			users.add(UserFakeDB.userDB.get(i));
		}
		
		return users;
	}

}
