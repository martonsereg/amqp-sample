package com.sequenceiq.rabbit.handler;

public class HelloWorldHandler {

	public void handleMessage(String text) {
		System.out.println("Received message: " + text);
	}

}
