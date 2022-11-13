package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18NController {
    private final GreetingService greetingService;
    private final GreetingService greetingBeanService;

    public I18NController(@Qualifier("i18nService") GreetingService greetingService,
                          @Qualifier("i18nBeanService") GreetingService greetingBeanService) {
        this.greetingService = greetingService;
        this.greetingBeanService = greetingBeanService;
    }

    public String getGreeting() {
        return greetingService.sayHello();
    }

    public String getBeanGreeting(){
        System.out.println("from BEAN" );
        return greetingBeanService.sayHello();
    }
}
