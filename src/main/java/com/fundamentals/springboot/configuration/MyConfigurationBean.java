package com.fundamentals.springboot.configuration;

import com.fundamentals.springboot.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation (){
        return new MyBeanSecondImplement();
    }

    @Bean
    public MyOperation beanOperationOperation (){
        return new MyOperationImplement();
    }
}
