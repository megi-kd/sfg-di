package guru.springframework.sfgdi.services;

public class AdditionalPrimaryServiceImpl implements GreetingService{


    @Override
    public String sayHello() {
        return "Additional PRIMARY service implementation";
    }
}
