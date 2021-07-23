package com.sharpcj.aopdemo;

import com.sharpcj.aopdemo.test1.Boy;
import com.sharpcj.aopdemo.test1.Girl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Boy boy = context.getBean("boy",Boy.class);
        Girl girl = (Girl) context.getBean("girl");
        boy.buy(33);
        girl.buy(99);

    }
}