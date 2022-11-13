package guru.springframework.sfgdi;

import com.sfg.pets.controllers.PetController;
import guru.springframework.sfgdi.controllers.*;
import guru.springframework.sfgdi.controllers.solid.ClaimApprovalManager;
import guru.springframework.sfgdi.services.solid_o.HealthInsuranceSurveyor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"guru.springframework.sfgdi", "com.sfg.pets"})
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

		PetController petController = (PetController) ctx.getBean("petController");
		System.out.println(petController.getActivePetType());

		System.out.println("--------@Bean Profiles");
		System.out.println(i18NController.getBeanGreeting());


		System.out.println("------ @Bean annotation");
		AdditionalController additionalController = (AdditionalController) ctx.getBean("additionalController");
		System.out.println(additionalController.getGreeting());

		System.out.println("-------- O - Open princple from SOLID ");
		ClaimApprovalManager claimApprovalManager = (ClaimApprovalManager) ctx.getBean("claimApprovalManager");
		System.out.println("calling process claim started: ");
		claimApprovalManager.processClaim();
		ClaimApprovalManager claimApprovalManager1 = new ClaimApprovalManager(new HealthInsuranceSurveyor());
		System.out.println("calling process claim 2 started: ");
		claimApprovalManager1.processClaim();

	}

}
