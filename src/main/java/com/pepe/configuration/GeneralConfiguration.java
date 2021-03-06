package com.pepe.configuration;

import com.pepe.bean.PropertiesBean;
import com.pepe.implement.PropertiesBeanImplement;
import com.pepe.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(UserPojo.class)
public class GeneralConfiguration {
    @Value("${value.name}")
    private String name;

    @Value("${value.lastName}")
    private String lastName;

    @Value("${value.random}")
    private String random;

    @Bean
    public PropertiesBean function(){
        return new PropertiesBeanImplement(name,lastName);
    }

}
