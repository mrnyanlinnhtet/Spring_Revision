package com.jdc.spring.listeners;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.jdc.spring.events.MessageEvent;

@Component
public class MyEventListener {

	@EventListener
	public void messageEventListener(MessageEvent messageEvent) {
		System.out.println(messageEvent.getMessage() + " : " + messageEvent.getSendAt());
	}

}
