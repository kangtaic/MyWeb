package com.sharpcj.aopdemo.test1;
import org.springframework.stereotype.Component;

@Component
public class Girl implements  IBuy {
    @Override
    public String buy(double price) {
        System.out.println("女孩买东西!");
        return "衣服";
    }
}
