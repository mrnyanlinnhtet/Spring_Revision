package com.jdc.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdc.ioc.HelloSpringBean;

public class HelloBeanTest {

	@Test
	 void test() {
		  try(var context = new AnnotationConfigApplicationContext("com.jdc.ioc")) {
			   var bean = context.getBean(HelloSpringBean.class);
			   System.out.println(bean.sayHello());
		  }
	 }
}
