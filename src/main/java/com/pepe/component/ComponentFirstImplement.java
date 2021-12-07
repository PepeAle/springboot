package com.pepe.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentFirstImplement implements IComponentDependency {

    @Override
    public void saludar() {
        System.out.println("Hola Pp");

    }
}
