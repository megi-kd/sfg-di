package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.datasource.FakeDatasource;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import guru.springframework.sfgdi.services.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@PropertySource("classpath:datasource.properties")
@Configuration
public class AdditionalGreetingServiceConfig {

    @Bean
    FakeDatasource fakeDatasource(@Value("${guru.username}") String username,
                                  @Value("${guru.password}") String password,
                                  @Value("${guru.jdbcurl}")String jdbcUrl){
        FakeDatasource fakeDatasource = new FakeDatasource();
        fakeDatasource.setUsername(username);
        fakeDatasource.setPassword(password);
        fakeDatasource.setJdbcurl(jdbcUrl);
        return fakeDatasource;

    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    }

    @Bean
    AdditionalI18NEnglishGreetingService additionalEnglishService(
            EnglishGreetingRepository englishGreetingRepository){
        return new AdditionalI18NEnglishGreetingService(englishGreetingRepository);
    }


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
