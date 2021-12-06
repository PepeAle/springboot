package com.fundamentals.springboot;

import com.fundamentals.springboot.bean.MyBean;
import com.fundamentals.springboot.bean.MyBeanImplement;
import com.fundamentals.springboot.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;
	private MyBean myBean;


	public SpringbootApplication(@Qualifier("componentSecondImplement") ComponentDependency componentDependency, MyBean myBean){
		this.componentDependency =componentDependency;
		this.myBean = myBean;

	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
		myBean.print();
	}
}
