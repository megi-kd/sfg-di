package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class AdditionalController {

    private final GreetingService greetingService;
    private final GreetingService greetingServiceEN;

    public AdditionalController( @Qualifier("additionalService")GreetingService greetingService,
                                 @Qualifier("additionalEnglishService")GreetingService greetingServiceEN) {
        this.greetingService = greetingService;
        this.greetingServiceEN = greetingServiceEN;
    }

    public String getGreeting(){
        return greetingService.sayHello();
    }

    public String getGreetingEN(){
        return greetingServiceEN.sayHello();
    }
}
