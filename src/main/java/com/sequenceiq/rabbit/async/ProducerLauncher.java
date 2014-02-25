package com.sequenceiq.rabbit.async;

import com.sequenceiq.rabbit.config.ProducerConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProducerLauncher {

	public static void main(String[] args) throws Exception {
		new AnnotationConfigApplicationContext(ProducerConfiguration.class);
	}

}
