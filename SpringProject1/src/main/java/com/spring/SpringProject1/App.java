package com.spring.SpringProject1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
//class App
public class App 
{
	//main method
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //creating the object of ApplicationContext interface
        ApplicationContext ac=new ClassPathXmlApplicationContext("springproject1.xml");
        //creating object st1 object Student class
        Student st1=(Student)ac.getBean("studentbean1");
        //creating object st2 object of Student class
        Student st2=(Student)ac.getBean("studentbean2");
        System.out.println("1st student details..............!!");
        System.out.println(st1);
        System.out.println("2nd student details...............!!");
        System.out.println(st2);
        System.out.println("Hello World");
    }
}
