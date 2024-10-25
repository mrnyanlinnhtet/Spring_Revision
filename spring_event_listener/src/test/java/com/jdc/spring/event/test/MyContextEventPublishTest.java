package com.jdc.spring.event.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdc.spring.ApplicationConfig;

public class MyContextEventPublishTest {

	@Test
	void test() {
		try (var context = new AnnotationConfigApplicationContext(ApplicationConfig.class)) {

		}
	}
}
