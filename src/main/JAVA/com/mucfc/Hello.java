package com.mucfc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

@Controller
public class Hello {
    @RequestMapping(value = "/hello", method = RequestMethod.GET, params = "userid")
    public String printWellcom(ModelMap modelMap, String userid) {
        modelMap.addAttribute("message", "ABCDFG");
        System.out.println("PrintWellcom.......");

        return "hello";
    }


    public void test() {
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        hashMap.put(1,"A01");
        hashMap.put(2,"A02");
        hashMap.put(3,"A03");
        hashMap.put(4,"A04");
        hashMap.put(5,"A05");
        Collection cl = hashMap.values();
        Iterator  iter = cl.iterator();
        while (iter.hasNext())
        {


        }
    }
}
