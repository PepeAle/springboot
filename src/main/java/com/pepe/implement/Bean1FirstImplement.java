package com.pepe.implement;

import com.pepe.bean.IBean1;

public class Bean1FirstImplement implements IBean1 {

    @Override
    public void print() {
        System.out.println("Hello Pp. I am the FIRST implementation of your bean");
    }
}
