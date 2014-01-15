package com.acme.doktoric.async;

import com.acme.doktoric.config.ProducerConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProducerLauncher {

	public static void main(String[] args) throws Exception {
		new AnnotationConfigApplicationContext(ProducerConfiguration.class);
	}

}
