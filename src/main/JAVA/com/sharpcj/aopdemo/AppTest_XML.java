package com.sharpcj.aopdemo;

import com.sharpcj.aopdemo.test1.IBuy;
import com.sharpcj.aopdemo.test1.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest_XML {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //proxy-target-class="true">   ，直接使用具体的类去接受对象
        //（2）当我们业务层没有使用实现接口的方式时，会默认采用cglib 的动态代理(这个的执行效率会高一些，利用到了字节码)
//        Boy boy = (Boy) context.getBean("boy_xml");
//        Girl girl = (Girl)context.getBean("girl_xml");
//        boy.buy(12);
//        girl.buy(99);
        Student  student = (Student) context.getBean("student");
        student.learn("Java");


        //使用 proxy-target-class="false"> ,使用接口去接收对象
        //（1）当我们业务层使用实现接口的方式时，会默认采用 JDK 的动态代理形式；
            IBuy boy = (IBuy) context.getBean("boy_xml");
            boy.buy(12);
            IBuy girl = (IBuy) context.getBean("girl_xml");
            girl.buy(99);

    }
}
