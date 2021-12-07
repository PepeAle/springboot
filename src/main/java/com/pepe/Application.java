package com.pepe;

import com.pepe.bean.IPersonBean;
import com.pepe.bean.PropertiesBean;
import com.pepe.pojo.Person;
import com.pepe.pojo.UserPojo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	// Inyección de dependencias

//	private IComponentDependency componentDependency;
//	private IBean1 bean;
//	private IBean3WithDependency bean3WithDependency;
//	private IPersonBean personBean;
//	private PropertiesBean propertiesBean;
	private UserPojo userPojo;

	public Application(UserPojo userPojo) {
		this.userPojo = userPojo;
	}
	//
//	public Application(PropertiesBean propertiesBean) {
//		this.propertiesBean = propertiesBean;
//	}
//	public Application(IComponentDependency componentDependency) {
//		this.componentDependency = componentDependency;
//	}

//	public Application(@Qualifier("componentSecondImplement") IComponentDependency componentDependency) {
//		this.componentDependency = componentDependency;
//	}

//	public Application(IBean1 bean) {
//		this.bean = bean;
//	}

//	public Application(IBean3WithDependency bean3WithDependency) {
//		this.bean3WithDependency = bean3WithDependency;
//	}

//	public Application(IPersonBean personBean) {
//		this.personBean = personBean;
//	}

	@Override
	public void run(String... args) {
//		componentDependency.saludar();
//		bean.print();
//		bean3WithDependency.printWithDependency();
//		bean3WithDependency.displayElements();
//		Other example
//		personBean.greet(new Person("Pepe",43));
//		System.out.println(propertiesBean.function());
		System.out.println(userPojo.getEmail() + " - " + userPojo.getPassword());

	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
