package guru.springframework.sfgdi.services;

public class AdditionalServiceImpl implements  GreetingService{
    @Override
    public String sayHello() {
        return "Additional Service Impl with no @Service annotation";
    }
}
