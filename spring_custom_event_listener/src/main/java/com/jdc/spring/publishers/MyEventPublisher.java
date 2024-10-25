package com.jdc.spring.publishers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.jdc.spring.events.MessageEvent;

@Component
public class MyEventPublisher {

	@Autowired
	private ApplicationEventPublisher publisher;

	public void messageEventPublisher(MessageEvent event) {
		publisher.publishEvent(event);
	}

}
