package com.spring.text;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Person {

	private IHelloMessage helloMessage ;


	public IHelloMessage getHelloMessage() {
		return helloMessage;
	}

	public void setHelloMessage(IHelloMessage helloMessage) {
		this.helloMessage = helloMessage;
	}
	
	public String sayHello(){
		return this.helloMessage.sayHello();
	}
}
