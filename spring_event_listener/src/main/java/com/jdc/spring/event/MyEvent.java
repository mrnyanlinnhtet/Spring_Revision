package com.jdc.spring.event;

import java.time.LocalDate;

public record MyEvent(String message, LocalDate publish_at) {

	public MyEvent(String name) {
		this(name, LocalDate.now());
	}
}
