package com.jdc.spring.events;

import java.time.LocalDateTime;

public class MessageEvent {

	private String message;
	private LocalDateTime sendAt;

	public MessageEvent(String message, LocalDateTime sendAt) {
		super();
		this.message = message;
		this.sendAt = sendAt;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getSendAt() {
		return sendAt;
	}

	public void setSendAt(LocalDateTime sendAt) {
		this.sendAt = sendAt;
	}

}
