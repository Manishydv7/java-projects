package user_mgt_project;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import user_mgt_project.ConnectionProvider;
//class UsersDAO
public class UsersDAO {

	// method for creating a user in table users in database
	public static boolean createUser(String uname,String password)
	{
		try
		{
			Connection con=ConnectionProvider.createConnection();
			PreparedStatement pstmt=con.prepareStatement("insert into users (uname,password) values(?,?)");
			pstmt.setString(1, uname);
			pstmt.setString(2, password);
			pstmt.executeUpdate();
			return true;
		}
		catch(Exception e)
		{
			System.out.println("\"User already exist. Create a unique user name.\"");
		}
		return false;
	}
	//method for updating the password in table users in database
	public static boolean updatePassword(String uname,String newPassword)
	{
		try
		{
			Connection con=ConnectionProvider.createConnection();
			PreparedStatement pstmt=con.prepareStatement("update users set password=(?) where uname=(?)");
			pstmt.setString(1,newPassword);
			pstmt.setString(2,uname);
			pstmt.executeUpdate();
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return false;
	}
	//method for deleting the user from the database
	public static boolean deletionUser(String uname)
	{
		try
		{
			Connection con=ConnectionProvider.createConnection();
			PreparedStatement pstmt=con.prepareStatement("delete from users where uname=(?)");
			pstmt.setString(1, uname);
			pstmt.executeUpdate();
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return false;
	}
	//retrieving the username and user password from retrieval method
	public static boolean retrievalUser(String uname)
	{
		try
		{
			Connection con=ConnectionProvider.createConnection();
			PreparedStatement pstmt=con.prepareStatement("select uname,password from users where uname=(?)");
			pstmt.setString(1, uname);
			ResultSet rs=pstmt.executeQuery();
			rs.next();
			System.out.println("The user is : "+rs.getString(1)+" and the password is : "+rs.getString(2));
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return false;
	}
	//displaying the complete list of all the users
	public static boolean displayingListOfAllTheUsers()
	{
		try
		{
			Connection con=ConnectionProvider.createConnection();
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select uname from users");
			while(rs.next())
			{
				System.out.println(" uname : "+rs.getString(1));
				System.out.println("*****************************");
			}
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return false;
	}
}
