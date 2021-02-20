package source.layers.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import source.layers.controller.UserController;

public class RequestHelper {

	public static void response(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Get the URI info from the different requests
		String uri = request.getRequestURI();

		// Different landing pages for the URI
		switch (uri) {

		case "/Project/---.do": {
			UserController.login(request, response);
			break;
		}
		default: {
			response.sendError(418, "Nonono");
		}

		}

	}

}
