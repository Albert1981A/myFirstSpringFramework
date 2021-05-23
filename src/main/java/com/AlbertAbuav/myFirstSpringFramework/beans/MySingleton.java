package com.AlbertAbuav.myFirstSpringFramework.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class MySingleton {

    private int x = (int)(Math.random()*101);

    public MySingleton() {
        System.out.println("mySingleton - CTOR IN ACTION - " + toString());
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "MySingleton{" +
                "x=" + x +
                '}';
    }
}
