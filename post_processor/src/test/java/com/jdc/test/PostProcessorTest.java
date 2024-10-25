package com.jdc.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.jdc.beans.MyBean;

public class PostProcessorTest {

	@Test
	void postProcessorTest() {

		try (var context = new GenericXmlApplicationContext("classpath:/application.xml")) {
			var bean = context.getBean(MyBean.class);
			System.out.println(bean.getValue());
		}
	}

}
