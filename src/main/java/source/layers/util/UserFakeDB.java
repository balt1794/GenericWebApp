package source.layers.util;

import java.util.HashMap;
import java.util.Map;

import source.layers.models.User;

public class UserFakeDB {

	
	public static Map<Integer, User> userDB;
	
	static {
		userDB = new HashMap<Integer, User>();
		
		User Bryam = new User(1, "Bryam", "Loaiza", "balt", "123", "balt@gmail.com");
		User Stephen = new User(2, "Stephen", "Benavides", "sb", "123" , "sb@gmail.com");
		
		userDB.put(1, Bryam);
		userDB.put(2, Stephen);
	}
}
