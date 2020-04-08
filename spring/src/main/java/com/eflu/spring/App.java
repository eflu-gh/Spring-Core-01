package com.eflu.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eflu.beans.World;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/eflu/xml/beans.xml");
		World world =  context.getBean("helloWorld",World.class);
	    System.out.println(world.getHello());
	    
	}

}
