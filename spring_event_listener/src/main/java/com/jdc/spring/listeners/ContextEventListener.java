package com.jdc.spring.listeners;

import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ContextEventListener {

	@EventListener
	public void onApplicationEvent(ApplicationContextEvent event) {
		System.out.println(event.getClass().getSimpleName());
	}

}
