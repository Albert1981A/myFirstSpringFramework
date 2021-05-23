package com.AlbertAbuav.myFirstSpringFramework;

import com.AlbertAbuav.myFirstSpringFramework.beans.MyPrototype;
import com.AlbertAbuav.myFirstSpringFramework.beans.MySingleton;
import com.AlbertAbuav.myFirstSpringFramework.config.MyConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfiguration.class);

        System.out.println("---------------------- MySingleton Class --------------------");

        MySingleton s1 = ctx.getBean(MySingleton.class);
        MySingleton s2 = ctx.getBean(MySingleton.class);

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("---------------------- MyPrototype Class --------------------");
        MyPrototype p1 = ctx.getBean(MyPrototype.class);
        MyPrototype p2 = ctx.getBean(MyPrototype.class);

        System.out.println(p1);
        System.out.println(p2);

    }

}
