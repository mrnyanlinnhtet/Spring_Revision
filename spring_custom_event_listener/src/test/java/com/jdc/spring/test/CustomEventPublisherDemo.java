package com.jdc.spring.test;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdc.spring.ApplicationConfig;
import com.jdc.spring.events.MessageEvent;
import com.jdc.spring.publishers.MyEventPublisher;

public class CustomEventPublisherDemo {

	@Test
	void eventPublihser_test() {
		try (var context = new AnnotationConfigApplicationContext(ApplicationConfig.class)) {
			
			 var publisher = context.getBean(MyEventPublisher.class);
			 publisher.messageEventPublisher(new MessageEvent("It is first event", LocalDateTime.now()));
			 publisher.messageEventPublisher(new MessageEvent("It is second event", LocalDateTime.now()));

		}
	}

}
