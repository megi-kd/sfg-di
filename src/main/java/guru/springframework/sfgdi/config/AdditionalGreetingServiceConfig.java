package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.AdditionalPrimaryServiceImpl;
import guru.springframework.sfgdi.services.AdditionalServiceImpl;
import guru.springframework.sfgdi.services.I18NEnglishGreetingService;
import guru.springframework.sfgdi.services.I18NSpanishGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class AdditionalGreetingServiceConfig {


    @Profile("EN")
    @Bean
    I18NEnglishGreetingService i18nBeanService(){
        return new I18NEnglishGreetingService();
    }

    @Profile({"ES", "default"})
    @Bean("i18nBeanService")
    I18NSpanishGreetingService i18NSpanishGreetingService(){
        return new I18NSpanishGreetingService();
    }

    //@Primary
    @Bean
    AdditionalPrimaryServiceImpl additionalPrimaryService(){
        return new AdditionalPrimaryServiceImpl();
    }

    @Bean
    AdditionalServiceImpl additionalService(){
        return new AdditionalServiceImpl();
    }


}
