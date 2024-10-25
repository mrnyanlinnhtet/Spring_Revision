package com.jdc.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdc.ioc.ApplicationConfig;
import com.jdc.ioc.bean.HelloSpringBean;

public class SpringBeanTest {

	@Test
	 void test() {
		 
		 try(var context = new AnnotationConfigApplicationContext(ApplicationConfig.class)) {
			 
			 var bean = context.getBean(HelloSpringBean.class);
			 System.out.println(bean.sayHello());
		 }
	 }
}
