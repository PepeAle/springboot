package com.pepe.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentSecondImplement implements IComponentDependency {

    @Override
    public void saludar() {
        System.out.println("Hi Pp from the second implementation");
    }
}