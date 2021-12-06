package com.pepe.springboot.configuration;

import com.pepe.springboot.bean.MyBean;
import com.pepe.springboot.bean.MyBeanSecondImplement;
import com.pepe.springboot.bean.MyOperation;
import com.pepe.springboot.bean.MyOperationImplement;
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
