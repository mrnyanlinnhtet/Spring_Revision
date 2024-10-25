package com.jdc.ioc;

import org.springframework.stereotype.Component;

@Component
public class AnnotatedBean {
	
	public String sayHello() {
		return "Message from annotated bean.";
	}

}
