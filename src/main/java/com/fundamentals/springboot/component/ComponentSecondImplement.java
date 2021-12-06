package com.fundamentals.springboot.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentSecondImplement implements ComponentDependency{
    @Override
    public void saludar() {
        System.out.println("Hi Pp from the second implementation");
    }
}
