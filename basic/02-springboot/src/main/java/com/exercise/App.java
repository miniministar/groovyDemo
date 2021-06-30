package com.exercise;

import com.exercise.groovy.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date ：Created in 2021/6/29 20:53
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-groovy.xml");
        HelloService helloService = context.getBean(HelloService.class);
        String sayHello = helloService.sayHello();
        System.out.println(sayHello);
    }
}
