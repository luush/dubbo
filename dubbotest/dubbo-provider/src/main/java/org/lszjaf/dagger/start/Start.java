package org.lszjaf.dagger.start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

    public static void main(String[] luush) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(context.getDisplayName()+" here");
        context.start();
        System.out.println("dubbo provider start");
        System.in.read();
    }
}
