package com.lithan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Name name=(Name) context.getBean("demo");
		
		System.out.println(name);
	}
}
