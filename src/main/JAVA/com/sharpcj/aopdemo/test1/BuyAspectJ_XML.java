package com.sharpcj.aopdemo.test1;

import org.aspectj.lang.ProceedingJoinPoint;

public class BuyAspectJ_XML {

    public void hehe() {
        System.out.println("before ...");
    }

    public void haha() {
        System.out.println("After ...");
    }

    public void xixi() {
        System.out.println("AfterReturning ...");
    }

    public void xxx(ProceedingJoinPoint pj,double price) {
        try {
            System.out.println("Around aaa ...");
            pj.proceed();
            if(price > 60)
                System.out.println("---->买了超过60元的东西！");
            System.out.println("Around bbb ...");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
