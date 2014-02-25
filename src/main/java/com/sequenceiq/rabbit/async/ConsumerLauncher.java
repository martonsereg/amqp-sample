package com.sequenceiq.rabbit.async;

import com.sequenceiq.rabbit.config.ConsumerConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConsumerLauncher {

	public static void main(String[] args) {
		new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
	}

}
