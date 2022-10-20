package user_mgt_project;

import java.sql.Connection;
import java.sql.DriverManager;
//class connection provider 
public class ConnectionProvider {
	//creating private static variable of Connection class
	private static Connection con;
	//method
	public static Connection createConnection() throws Exception
	{
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb2","root","Root");
		return con;
	}
}
