package com.springhibernate.Service;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springhibernate.Entity.User;
import com.springhibernate.UserDao.UserDao;
import com.springhibernate.UserDaoImp.UserDaoImpl;

/**
 * Hello world!
 *
 */
//class App
public class App {
	//main method
	public static void main(String[] args) {
		//creating ApplicationContext class reference
		ApplicationContext ac = new ClassPathXmlApplicationContext("usermngt.xml");
		
		UserDao ud = (UserDao) ac.getBean("udao1");
		
		char c='y';
		//while loop
		while (c=='y') {
			//providing user a facility to perform several task
			System.out.println("Choose any options on which you want to perform task :\n");
			
			System.out.println("Choose 1st option to insert the user details: ");
			System.out.println("Choose 2nd option to update the user details: ");
			System.out.println("Choose 3rd option to delete the user details: ");
			System.out.println("Choose 4th option to see specific user details: ");
			System.out.println("Choose 5th option to display the user details: ");
			System.out.println("Choose 6th option to exit:");
			//creating Scanner class object
			Scanner sc = new Scanner(System.in);
			System.out.println("Choose any options which you want to choose :\n");
			int i = sc.nextInt();
			//switch cases
			switch (i) {
			//case 1 -> for inserting user details
			case 1: {
				User u = new User();
				System.out.println("insert User id:");
				int us1 = sc.nextInt();
				u.setUid(us1);
				System.out.println("insert User name:");
				String us2 = sc.next();
				u.setUname(us2);
				System.out.println("insert User password");
				String us3 = sc.next();
				u.setUpassword(us3);
				int i1 = ud.insertUserDetails(u);
				if (i1 == 1)
					System.out.println("user details inserted successfully...");
				else
					System.out.println("problem occured during inserting user details...");
				break;
			}
			//case 2: for updating user details
			case 2: {
				User u1 = new User();
				System.out.println("enter id where to update the user details...");
				int us1 = sc.nextInt();
				u1.setUid(us1);
				System.out.println("enter user new name to update...");
				String us2 = sc.next();
				u1.setUname(us2);
				System.out.println("enter user new password to update...");
				String us3 = sc.next();
				u1.setUpassword(us3);
				int i2 = ud.updateUserDetails(u1);
				if (i2 == 1)
					System.out.println("user details inserted successfully...");
				else
					System.out.println("problem occured during inserting user details...");
				break;
			}
			//case 3: for deleting user details
			case 3: {
				User u2 = new User();
				System.out.println("enter the user id for whose record you want to delete :");
				int us1 = sc.nextInt();
				u2.setUid(us1);
				int i3 = ud.deleteUserDetails(u2);
				if (i3 == 1)
					System.out.println("user details deleted successfully...");
				else
					System.out.println("problem occured during deleting user details...");
				break;

			}
			//case 4: for retrieving specific user details
			case 4: {
				System.out.println("enter uid to get specific user detail: ");
				int uid=sc.nextInt();
				User ug=ud.getSpecificUserDetails(uid);
				System.out.println("The details of the user is : ");
				System.out.println(ug);
				break;
			}
			//case 5: for displaying all user details
			case 5: {
				User u3 = new User();
				System.out.println("displaying all users details...");

				List<User> list = ud.getAllDetails();
				System.out.println("\n" + list + "\n");
				break;
			}
			//case 6 for creating a door to exit 
			case 6:{
				System.out.println("Have a nice day...bye!!");
				c='n';
				break;
			}
			//default
			default:
				System.out.println("please choose a valid option...\n");
			}
			System.out.println("do you want to continue y/n...");
			c=sc.next().charAt(0);
		}
	}
}
