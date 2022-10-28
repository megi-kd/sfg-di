package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SetterServiceImpl implements  GreetingService{

    @Override
    public String sayHello() {
        return "Hello from Setter";
    }
}
