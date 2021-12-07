package com.pepe.configuration;

import com.pepe.bean.*;
import com.pepe.implement.Bean1ThirdImplement;
import com.pepe.implement.Bean2Implement;
import com.pepe.implement.Bean3WithDependencyImplement;
import com.pepe.implement.PersonImplement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationBean {
    @Bean
    public IBean1 bean1Operation (){
//        return new Bean1FirstImplement();
//        return new Bean1SecondImplement();
        return new Bean1ThirdImplement();
    }

    @Bean
    public IBean2 bean2Operation (){
        return new Bean2Implement();
    }

    @Bean
    public IBean3WithDependency bean3Operation (IBean2 myOperation){
        return new Bean3WithDependencyImplement(myOperation);
    }

    @Bean
    public IPersonBean personOperation (){
        return new PersonImplement();
    }
}
