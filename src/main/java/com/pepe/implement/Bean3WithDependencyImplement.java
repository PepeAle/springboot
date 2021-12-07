package com.pepe.implement;

import com.pepe.bean.IBean2;
import com.pepe.bean.IBean3WithDependency;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;

public class Bean3WithDependencyImplement implements IBean3WithDependency {

    Log LOGGER = LogFactory.getLog(Bean3WithDependencyImplement.class);


    private IBean2 myOperation;

    public Bean3WithDependencyImplement(IBean2 myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        LOGGER.info("I am in the printWithDependency method");
        int age=43;
        LOGGER.debug("the age is "+ age);
        System.out.println("I am "+myOperation.sum(age));
        System.out.println("Hi Pp. I am the implementation of your bean with dependency.");

    }

    @Override
    public void displayElements() {
        System.out.println("This operation generates a random numbers list");
        List <Integer> randNumbers = myOperation.generateRandomNumbers(500, 10);
        randNumbers.forEach(System.out::println);
    }
}
