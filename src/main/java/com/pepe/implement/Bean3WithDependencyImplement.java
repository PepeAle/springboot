package com.pepe.implement;

import com.pepe.bean.IBean2;
import com.pepe.bean.IBean3WithDependency;

import java.util.List;

public class Bean3WithDependencyImplement implements IBean3WithDependency {

    private IBean2 myOperation;

    public Bean3WithDependencyImplement(IBean2 myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        int age=43;
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
