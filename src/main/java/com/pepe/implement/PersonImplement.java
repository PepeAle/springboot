package com.pepe.implement;

import com.pepe.bean.IPersonBean;
import com.pepe.pojo.Person;

public class PersonImplement implements IPersonBean {

    @Override
    public void greet(Person person) {
        System.out.println("Hi "
                +person.getName()+ ", I am "
                +person.getAge()+ "."
        );

    }
}
