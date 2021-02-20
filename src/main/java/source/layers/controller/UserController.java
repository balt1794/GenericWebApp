package source.layers.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import source.layers.models.User;
import source.layers.services.UserServiceImpl;


public class UserController {  
	
	static User user = new User();
	static Gson gson = new Gson();
	static UserServiceImpl userService = new UserServiceImpl();
    

	//User Login
	public static void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User u = gson.fromJson(request.getReader(), User.class);
		
		user.setUsername(u.getUsername());
		user.setPassword(u.getPassword());
		
		userService.login(user.getUsername(), user.getPassword());
		
		response.setStatus(200);
		
		//Check user role ID 
		int roleID = user.getU_id();
		
		//Change landing page according to user ID 
		switch(roleID) {
		//Normal User
		case 0:{
			response.getWriter().append("LANDING PAGE");
			break;
		}
		default:
			response.getWriter().append("HOME PAGE");
		}
	}

	//User Logout 
	public static void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		user = null;
		response.setStatus(200);
		response.getWriter().append("HOME PAGE");
	}
	
	//User Registration 
	public static void userRegistration(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User u = gson.fromJson(request.getReader(), User.class);
		userService.registerUser((int)Math.random()*5 + 10, u);
	}


}
