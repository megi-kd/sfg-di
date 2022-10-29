package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.sayHello());

		System.out.println("------ Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------ Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------ Constructor");
		ConstructorInjectedController constructorGreetingController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorGreetingController.getGreeting());

		System.out.println("------- Primary");
		PrimaryController primaryController = (PrimaryController) ctx.getBean("primaryController");
		System.out.println(primaryController.getGreeting());

		System.out.println("-------- Profiles");
		I18NController i18NController = (I18NController) ctx.getBean("i18NController");
		System.out.println(i18NController.getGreeting());
	}

}
