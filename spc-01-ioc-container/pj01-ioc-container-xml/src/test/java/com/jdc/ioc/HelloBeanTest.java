package com.jdc.ioc;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloBeanTest {
	
	@Test
	 void test() {
		  try(var context = new GenericXmlApplicationContext("classpath:/application.xml")) {
			   var bean = context.getBean(HelloBean.class);
			   System.out.println(bean.sayHello());
			   
			  var annotationBean = context.getBean(AnnotatedBean.class);
			  System.out.println(annotationBean.sayHello());
		  }
	 }

}
