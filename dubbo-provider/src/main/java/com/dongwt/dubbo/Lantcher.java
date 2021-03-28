package com.dongwt.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lantcher {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/spring/spring-mvc.xml");
        applicationContext.start();
        System.out.println("start up ok");
        Thread.currentThread().join();
    }
}
