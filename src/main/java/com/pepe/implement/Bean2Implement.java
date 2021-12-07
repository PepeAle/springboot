package com.pepe.implement;

import com.pepe.bean.IBean2;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Bean2Implement implements IBean2 {
    @Override
    public int sum(int number) {
        return number+1;
    }

    @Override
    public List<Integer> generateRandomNumbers(int maxNumber, int maxLimit) {
        return new Random().ints(0,maxNumber)
                .limit(maxLimit)
                .boxed()
                .collect(Collectors.toList());
    }
}
