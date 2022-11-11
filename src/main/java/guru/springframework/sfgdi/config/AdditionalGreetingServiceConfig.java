package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.AdditionalServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AdditionalGreetingServiceConfig {

    @Bean
    AdditionalServiceImpl additionalService(){
        return new AdditionalServiceImpl();
    }


}
