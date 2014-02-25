package com.sequenceiq.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RabbitApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(RabbitConf.class);
        AmqpTemplate template = context.getBean(AmqpTemplate.class);

        template.convertAndSend("myqueue", "foo");

        String foo = (String) template.receiveAndConvert("myqueue");
        System.out.println(foo);
    }

}
