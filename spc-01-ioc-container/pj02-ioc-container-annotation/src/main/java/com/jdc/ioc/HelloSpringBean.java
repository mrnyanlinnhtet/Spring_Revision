package com.jdc.ioc;

import org.springframework.stereotype.Component;

@Component
public class HelloSpringBean {
	
	public String sayHello() {
		return "It is message from annotation config spring bean.";
	}

}
