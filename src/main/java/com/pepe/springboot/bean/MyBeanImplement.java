package com.pepe.springboot.bean;

public class MyBeanImplement implements MyBean{

    @Override
    public void print() {
        System.out.println("Hello Pp from my own implementation of the bean");
    }
}