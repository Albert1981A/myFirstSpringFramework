package com.AlbertAbuav.myFirstSpringFramework.beans;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")  // Another way to make the been a prototype:  @Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class MyPrototype {
    private int x = (int)(Math.random()*101);

    public MyPrototype() {
        System.out.println("MyPrototype - CTOR IN ACTION - " + toString());
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "MyPrototype{" +
                "x=" + x +
                '}';
    }
}
