package com.fundamentals.springboot.component;

import org.springframework.stereotype.Component;

@Component
public class ComplementImplement implements ComponentDependency{

    @Override
    public void saludar() {
        System.out.println("Hola Pp");

    }
}
