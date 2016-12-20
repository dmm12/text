package com.spring.text;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*import org.springframework.*;*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext  ioc = new ClassPathXmlApplicationContext("helloMessage.xml");
		Person person = (Person) ioc.getBean("person");
		String syshello = person.sayHello();
		System.out.println(syshello);
	}

}
