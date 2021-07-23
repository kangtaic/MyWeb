package com.sharpcj.aopdemo.test1;

import org.aspectj.lang.ProceedingJoinPoint;

public class StudentAspectJ_XML {
    public void AroundLeanrn(ProceedingJoinPoint pj, String book)
    {
        System.out.println("Arangd Begin");
        try {
            pj.proceed();
            System.out.println("Around learn "+book);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("Arangd End");


    }
}
