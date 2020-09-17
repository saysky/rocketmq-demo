package com.example.rocketmq.consumer.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class RocketmqConsumerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RocketmqConsumerDemoApplication.class, args);
    }

}
