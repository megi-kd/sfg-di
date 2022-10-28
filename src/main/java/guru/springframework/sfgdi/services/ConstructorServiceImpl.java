package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorServiceImpl implements GreetingService{

    @Override
    public String sayHello() {
        return "Hello from Constructor";
    }
}
