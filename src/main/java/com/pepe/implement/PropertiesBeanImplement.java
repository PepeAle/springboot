package com.pepe.implement;

import com.pepe.bean.PropertiesBean;

public class PropertiesBeanImplement implements PropertiesBean {
    private String name;
    private String lastName;

    public PropertiesBeanImplement(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String function() {
        return "Hi, I am " + name + " "+lastName;
    }
}
