package guru.springframework.sfgdi.services.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.context.properties.ConfigurationPropertiesBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {

    public PrototypeBean() {
        System.out.println("Prototype Bean Constructor!!!!!!!!!!!");
    }

    public String getMyScope(){
        return "I'm Prototype Scope";
    }
}
