package source.layers.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCConnection {

	private Connection conn = null;

	public Connection getConnection() {

		if (conn == null) {
			// Set up connection to the server
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");

				FileInputStream file = new FileInputStream(
						JDBCConnection.class.getClassLoader().getResource("connection.properties").getFile());

				Properties p = new Properties();
				p.load(file);

				String url = p.getProperty("url");
				String user = p.getProperty("user");
				String password = p.getProperty("password");

				// Set up the connection with inputed parameters
				conn = DriverManager.getConnection(url, user, password);
				
				return conn;

			} catch (ClassNotFoundException | IOException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return conn;

	}
}
